package com.example.__spring_webservices.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "projects")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "title")
    private String title;
    LocalDateTime startTime;
    LocalDateTime endTime;
    private int budget;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;
}

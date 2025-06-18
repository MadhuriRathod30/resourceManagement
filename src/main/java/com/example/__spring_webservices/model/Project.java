package com.example.__spring_webservices.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue
    int id;
    @NotBlank
    String title;
    LocalDateTime startTime;
    LocalDateTime endTime;
    int budget;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;
}

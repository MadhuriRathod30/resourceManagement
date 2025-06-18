package com.example.__spring_webservices.model;

import com.example.__spring_webservices.repository.DepartmentRepository;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    int id;
    @NotBlank
    String firstName;
    @NotBlank
    String lastName;
    @NotNull
    int salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;


    @ManyToMany
    @JoinTable(
            name = "employees_projects",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private List<Project> projects;
}

package com.example.__spring_webservices.controller;

import com.example.__spring_webservices.model.Department;
import com.example.__spring_webservices.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping
    Department create(@RequestBody Department department){
        return departmentService.create(department);
    }

    @GetMapping("/{id}")
    Optional<Department> get(@PathVariable("id") int departmentId){
        return departmentService.getById(departmentId);
    }


    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") int departmentId){
        departmentService.deleteById(departmentId);

    }
}

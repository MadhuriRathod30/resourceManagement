package com.example.__spring_webservices.controller;

import com.example.__spring_webservices.model.Project;
import com.example.__spring_webservices.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @PostMapping
    Project create(@RequestBody Project project){

        Project project1 = new Project();
        project1.setId(project.getId());
        project1.setTitle(project.getTitle());
        project1.setBudget(project.getBudget());
        project1.setStartTime(LocalDateTime.now());
        project1.setEndTime(LocalDateTime.now().plusMonths(3));
       return  projectService.createProject(project1);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") int id){
        projectService.delete(id);
    }

    @GetMapping("/{id}")
    Project getProjectById(@PathVariable("id") int id){
        return projectService.getProjectById(id);
    }

}

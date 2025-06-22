package com.example.__spring_webservices.controller;

import com.example.__spring_webservices.dto.AssignmentRequest;
import com.example.__spring_webservices.model.Employee;
import com.example.__spring_webservices.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assign")
public class AssignmentController {

    @Autowired
    AssignmentService assignmentService;

    @PostMapping
    Employee assignProject(@RequestBody AssignmentRequest request){
        return assignmentService.assignProject(request);
    }
}

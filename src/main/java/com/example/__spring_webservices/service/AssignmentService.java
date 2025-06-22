package com.example.__spring_webservices.service;

import com.example.__spring_webservices.controller.EmployeeController;
import com.example.__spring_webservices.dto.AssignmentRequest;
import com.example.__spring_webservices.model.Employee;
import com.example.__spring_webservices.model.Project;
import com.example.__spring_webservices.repository.EmployeeRepository;
import com.example.__spring_webservices.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serial;

@Service
public class AssignmentService {

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    EmployeeRepository employeeRepository;


    public Employee assignProject(AssignmentRequest request){

        int empId = request.getEmpId();
        int projectId = request.getProjectId();

        Project project = projectRepository.getReferenceById(projectId);

        Employee emp  = employeeRepository.getReferenceById(empId);
        emp.getProjects().add(project);

        return employeeRepository.save(emp);
    }
}

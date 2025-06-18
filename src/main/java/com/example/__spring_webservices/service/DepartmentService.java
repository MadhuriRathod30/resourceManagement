package com.example.__spring_webservices.service;

import com.example.__spring_webservices.model.Department;
import com.example.__spring_webservices.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department create(Department department){
        return departmentRepository.save(department);
    }

    public Optional<Department> getById(int deptId){
        return departmentRepository.findById(deptId);
    }


    public void deleteById(int departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}

package com.example.__spring_webservices.service;

import com.example.__spring_webservices.model.Employee;
import com.example.__spring_webservices.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Optional<Employee> getById(int empId) {
        return employeeRepository.findById(empId);
    }

    public Employee create(Employee employee) {

        return employeeRepository.save(employee);
    }

    public void delete(int empId) {
        employeeRepository.deleteById(empId);
    }
}

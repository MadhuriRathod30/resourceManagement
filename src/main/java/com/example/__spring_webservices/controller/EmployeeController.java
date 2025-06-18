package com.example.__spring_webservices.controller;

import com.example.__spring_webservices.model.Employee;
import com.example.__spring_webservices.repository.EmployeeRepository;
import com.example.__spring_webservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    Employee create(@RequestBody Employee employee){

        Employee emp = new Employee();
        emp.setFirstName(employee.getFirstName());
        emp.setLastName(employee.getLastName());
        emp.setDepartment(employee.getDepartment());
        emp.setSalary(employee.getSalary());
        return employeeService.create(employee);
    }

    @GetMapping("/{id}")
    Optional<Employee> getById(@PathVariable("id") int empId){
        return employeeService.getById(empId);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") int empId){

        employeeService.delete(empId);

    }


}

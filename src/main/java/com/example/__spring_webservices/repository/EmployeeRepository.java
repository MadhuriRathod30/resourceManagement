package com.example.__spring_webservices.repository;

import com.example.__spring_webservices.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}

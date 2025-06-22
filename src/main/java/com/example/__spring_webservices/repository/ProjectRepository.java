package com.example.__spring_webservices.repository;

import com.example.__spring_webservices.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ProjectRepository extends JpaRepository<Project , Integer> {
}

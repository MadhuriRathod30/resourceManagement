package com.example.__spring_webservices.service;

import com.example.__spring_webservices.model.Project;
import com.example.__spring_webservices.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public Project createProject(Project project){
        return projectRepository.save(project);
    }

    public void delete(int id) {
        projectRepository.deleteById(id);
    }

    public Project getProjectById(int id) {
        return projectRepository.getReferenceById(id);
    }
}

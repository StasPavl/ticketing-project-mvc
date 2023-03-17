package com.cydeo.service.impl;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.enums.Status;
import com.cydeo.service.ProjectService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl extends AbstractMapService<ProjectDTO,String> implements ProjectService {
    @Override
    public ProjectDTO save(ProjectDTO project) {
        if (project.getStatus()==null){
            project.setStatus(Status.OPEN);
        }
        return super.save(project.getCode(), project);
    }

    @Override
    public ProjectDTO findById(String projectCode) {
        return super.findById(projectCode);
    }

    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String projectCode) {
        super.deleteById(projectCode);
    }

    @Override
    public void update(ProjectDTO object) {
        if (object.getStatus()==null){
            object.setStatus(findById(object.getCode()).getStatus());
        }
        super.update(object.getCode(),object);
    }

    @Override
    public void complete(ProjectDTO project) {
    if (project.getStatus() != Status.COMPLETE){
        project.setStatus(Status.COMPLETE);
    }
    }
}

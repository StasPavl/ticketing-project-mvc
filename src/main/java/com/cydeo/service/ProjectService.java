package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;

public interface ProjectService extends CRUDService<ProjectDTO,String> {

    void complete(ProjectDTO project);
}

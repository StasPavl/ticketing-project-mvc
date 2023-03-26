package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.UserDTO;

import java.util.List;

public interface ProjectService extends CRUDService<ProjectDTO,String> {

    void complete(ProjectDTO project);

    List<ProjectDTO> getCountedListOfProjectDTO(UserDTO manager);
}

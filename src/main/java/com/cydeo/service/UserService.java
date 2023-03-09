package com.cydeo.service;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO save(UserDTO user);
    UserDTO findById(Long id);
    List<UserDTO> findAll();
    void deleteById(String username);
}

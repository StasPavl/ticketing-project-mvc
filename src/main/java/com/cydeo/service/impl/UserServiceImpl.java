package com.cydeo.service.impl;

import com.cydeo.dto.UserDTO;
import com.cydeo.service.UserService;

import java.util.List;

public class UserServiceImpl extends AbstractMapService<UserDTO,String> implements UserService {
    @Override
    public UserDTO save(UserDTO user) {
        return super.save(user.getUserName(),user);
    }

    @Override
    public UserDTO findById(String id) {
        return super.findById(id);
    }

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }
}

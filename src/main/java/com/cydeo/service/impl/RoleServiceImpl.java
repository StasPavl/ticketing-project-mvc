package com.cydeo.service.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class RoleServiceImpl extends AbstractMapService<RoleDTO, Long> implements RoleService {
    @Override
    public RoleDTO save(RoleDTO user) {
        return super.save(user.getId(),user);
    }

    @Override
    public RoleDTO findById(Long id) {
        return super.findById(id);
    }

    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

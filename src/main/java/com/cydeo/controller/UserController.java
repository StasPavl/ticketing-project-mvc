package com.cydeo.controller;

import com.cydeo.dto.UserDTO;
import com.cydeo.service.impl.RoleServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
        private final RoleServiceImpl roleService;

        public UserController(RoleServiceImpl roleService) {
                this.roleService = roleService;
        }

        @GetMapping("/create")
        public String createUser(Model model){

                model.addAttribute("user", new UserDTO());
                model.addAttribute("listRoles",roleService.findAll());
        return "/user/create";
        }
}

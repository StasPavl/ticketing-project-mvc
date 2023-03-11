package com.cydeo.controller;

import com.cydeo.dto.UserDTO;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import com.cydeo.service.impl.RoleServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
        private final RoleService roleService;
        private final UserService userService;

        public UserController(RoleService roleService, UserService userService) {
                this.roleService = roleService;
                this.userService = userService;
        }

        @GetMapping("/create")
        public String createUser(Model model){

                model.addAttribute("user", new UserDTO());
                model.addAttribute("listRoles",roleService.findAll());
                model.addAttribute("listUser", userService.findAll());

        return "/user/create";
        }

}

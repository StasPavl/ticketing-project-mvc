package com.cydeo.controller;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Status;
import com.cydeo.service.ProjectService;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/project")
public class ProjectController {
    private final ProjectService projectService;
    private final UserService userService;
    private final RoleService roleService;

    public ProjectController(ProjectService projectService, UserService userService, RoleService roleService) {
        this.projectService = projectService;
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping("/create")
    public String createProject(Model model){

        model.addAttribute("project", new ProjectDTO());
        model.addAttribute("managers", userService.findManagers());
        model.addAttribute("projects",projectService.findAll());

        return "/project/create";
    }
    @PostMapping("/create")
    public String insertProject(@ModelAttribute("project") ProjectDTO project){



        projectService.save(project);

        return "redirect:/project/create";
    }
    @GetMapping("/delete/{code}")
    public String deleteProject(@PathVariable("code") String code, Model model){
        projectService.deleteById(code);
        model.addAttribute("managers", userService.findAll());
        model.addAttribute("projects",projectService.findAll());
        return "redirect:/project/create";
    }
    @GetMapping("/complete/{code}")
    public String completeProject(@PathVariable("code") String code){

        projectService.complete(projectService.findById(code));

        return "redirect:/project/create";
    }
    @GetMapping("/update/{code}")
    public String updateUser(@PathVariable("code") String code,  Model model){

        model.addAttribute("project", projectService.findById(code));

        model.addAttribute("managers",userService.findManagers());
        model.addAttribute("projects", projectService.findAll());

        return "/project/update";
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute("project") ProjectDTO project){

        projectService.update(project);

        return"redirect:/project/create";
    }
    @GetMapping("/manager/project-status")
    public String getProjectByManager(Model model){

        UserDTO manager = userService.findById("john@cydeo.com");//coming from log in page(security)
        List<ProjectDTO> projects = projectService.getCountedListOfProjectDTO(manager);

        model.addAttribute("projects", projects);

        return "/manager/project-status";

    }



}

package com.cydeo.controller;

import com.cydeo.dto.TaskDTO;
import com.cydeo.service.ProjectService;
import com.cydeo.service.TaskService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/task")
public class TaskController {
    private final ProjectService projectService;
    private final UserService userService;
    private final TaskService taskService;

    public TaskController(ProjectService projectService, UserService userService, TaskService taskService) {
        this.projectService = projectService;
        this.userService = userService;
        this.taskService = taskService;
    }

    @GetMapping("/create")
    public String taskCreate(Model model){
        model.addAttribute("task", new TaskDTO());
        model.addAttribute("projects", projectService.findAll());
        model.addAttribute("employeeList", userService.findEmployee());
        model.addAttribute("taskList", taskService.findAll());
        return "/task/create";
    }
    @PostMapping("/create")
    public String taskCreate(@ModelAttribute("task") TaskDTO task, Model model){

        taskService.save(task);
        model.addAttribute("projects", projectService.findAll());
        model.addAttribute("employeeList", userService.findEmployee());
        model.addAttribute("taskList", taskService.findAll());
        return "redirect:/task/create";
    }
}

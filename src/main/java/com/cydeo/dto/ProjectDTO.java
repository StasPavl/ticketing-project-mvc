package com.cydeo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO {

    private String name;
    private String code;
    private UserDTO assignedManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private String details;
}

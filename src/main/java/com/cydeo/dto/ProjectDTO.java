package com.cydeo.dto;

import com.cydeo.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO {

    private String name;
    private String code;
    private UserDTO assignedManager;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;
    private String details;
    private Status status;

    private int completeTaskCounts;
    private int unfinishedTaskCounts;

    public ProjectDTO(String name, String code, UserDTO assignedManager, LocalDate startDate, LocalDate endDate, String details, Status status) {
        this.name = name;
        this.code = code;
        this.assignedManager = assignedManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.details = details;
        this.status = status;
    }
}

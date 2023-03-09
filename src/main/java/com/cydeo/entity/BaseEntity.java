package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

    private Long id;
    private LocalDate insertDateTime;
    private Long insertUserId;
    private LocalDate lastUpdateDateTime;
    private Long lastUpdateUserId;
}

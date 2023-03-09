package com.cydeo.Model;

import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private boolean enabled; //gonna use it in security
    private String phone;
    private Role role;
    private Gender gender;

    public User(Long id, LocalDate insertDateTime, Long insertUserId, LocalDate lastUpdateDateTime, Long lastUpdateUserId, String firstName, String lastName, String userName, String passWord, boolean enabled, String phone, Role role, Gender gender) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.passWord = passWord;
        this.enabled = enabled;
        this.phone = phone;
        this.role = role;
        this.gender = gender;
    }
}

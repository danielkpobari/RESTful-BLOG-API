package com.enwerevincent.restblog.DTO;

import lombok.Data;

import javax.persistence.Column;

@Data
public class UserDto {
    private String name;
    private String email;
    private String role;
    private String password;

    public UserDto(String name, String email, String role, String password) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.password = password;
    }
}

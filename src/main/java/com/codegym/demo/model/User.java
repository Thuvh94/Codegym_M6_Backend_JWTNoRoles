package com.codegym.demo.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    private String fullName;

    @NotEmpty
    private String phone;

    private String address;

    private String email;

    private String avatar;
}

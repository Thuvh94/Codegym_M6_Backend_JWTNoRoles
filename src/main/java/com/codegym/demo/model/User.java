package com.codegym.demo.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotEmpty
    private String username;

    @NotEmpty
//    @Size(min = 6, max = 8)
    private String password;

    private String fullName;

    @NotEmpty
    private String phone;

    private String address;

    private String email;

    private String avatar;
}

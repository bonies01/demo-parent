package com.example.demoauth.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Data
@EqualsAndHashCode
@ToString
public class SysUser {

    private String id;

    private String username;

    private String name;

    private String password;

    private String phone;

    private String email;
}
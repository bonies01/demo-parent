package com.example.demoauth.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@EqualsAndHashCode
@ToString
public class SysPermission {

    private String id;

    private String name;

    private String description;

    private String parentId;
}
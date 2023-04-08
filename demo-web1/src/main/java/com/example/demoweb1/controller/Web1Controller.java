package com.example.demoweb1.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web1Controller {

    @PostMapping("/query1")
    public String query(){
        return "这是web1服务";
    }
}

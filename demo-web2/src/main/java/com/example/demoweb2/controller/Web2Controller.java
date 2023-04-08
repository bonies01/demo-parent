package com.example.demoweb2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web2Controller {

    @PostMapping("/query2")
    public String query(){
        return "这是web2服务";
    }
}

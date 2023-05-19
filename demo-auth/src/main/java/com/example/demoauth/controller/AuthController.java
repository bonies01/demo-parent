package com.example.demoauth.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("connect")
    public String connect(){
        return "connected success";
    }

}

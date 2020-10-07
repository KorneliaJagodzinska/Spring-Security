package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello-admin")
    public String forAdmin(){
        return "hello admin";
    }

    @GetMapping("/hello-user")
    public String forUser(){
        return "hello user";
    }
}

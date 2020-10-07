package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @GetMapping("/for-admin")
    public String forAdmin(){
        return "hello admin";
    }

    @GetMapping("/for-user")
    public String forUser(){
        return "hello user";
    }
    @GetMapping("/sign-up")
    public String signUp(Model model){
        model.addAttribute("user", new AppUser());
        return "sign-up";
    }
    @GetMapping("/register")
    public String register(AppUser appUser){
        return "sign-up";
    }
}

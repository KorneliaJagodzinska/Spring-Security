package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.model.AppUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;
import java.util.Collection;

@Controller
public class UserController {
  UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String hello(Principal principal, Model model){
        model.addAttribute("name", principal.getName());
        Collection<? extends GrantedAuthority> authorities=
                 SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        model.addAttribute("authorities", authorities);
        return "hello";
    }

    @GetMapping("/sign-up")
    public String signUp(Model model){
        model.addAttribute("user", new AppUser());
        return "sign-up";
    }
    @PostMapping("/register")
    public String register(AppUser appUser){
        userService.addUser(appUser);
        return "sign-up";
    }
}

package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Start {
    private AppUserRepo appUserRepo;

    public Start(AppUserRepo appUserRepo, PasswordEncoder passwordEncoder) {
        AppUser appUser= new AppUser();
        appUser.setUserName("Kornelia");
        appUser.setPassword(passwordEncoder.encode("123"));
        appUser.setRole("ROLE_ADMIN");
        appUserRepo.save(appUser);
    }
}

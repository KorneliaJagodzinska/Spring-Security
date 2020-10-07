package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Start {
    private AppUserRepo appUserRepo;

    public Start(AppUserRepo appUserRepo, PasswordEncoder passwordEncoder) {
        AppUser appUserKornelia= new AppUser();
        appUserKornelia.setUserName("Kornelia");
        appUserKornelia.setPassword(passwordEncoder.encode("123"));
        appUserKornelia.setRole("ROLE_ADMIN");
        appUserRepo.save(appUserKornelia);


        AppUser appUserKasia= new AppUser();
        appUserKasia.setUserName("Kasia");
        appUserKasia.setPassword(passwordEncoder.encode("1234"));
        appUserKasia.setRole("ROLE_USER");
        appUserRepo.save(appUserKasia);
    }
}

package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    @OneToOne
    private AppUser appUser;
}

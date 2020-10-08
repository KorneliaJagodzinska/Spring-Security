package com.example.demo.repo;

import com.example.demo.model.AppUser;
import com.example.demo.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepo extends JpaRepository<Token, Long> {
    AppUser findByUserName(String userName);
}

package com.demo.monolithic_spring_security_product_demo.dao;

import java.util.Optional;

import com.demo.monolithic_spring_security_product_demo.entity.AuthUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthUserDoa extends JpaRepository<AuthUser,Integer> {
    Optional<AuthUser> findByAuthUserName(String authUsername);
}

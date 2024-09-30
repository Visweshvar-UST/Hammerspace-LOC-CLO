package com.demo.monolithic_spring_security_product_demo.controller;

import com.demo.monolithic_spring_security_product_demo.entity.AuthUser;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthUserController {

    
    @PostMapping("/authusers/validate")
    public AuthUser validate(@RequestBody AuthUser user){
        return null;
    }
    
}

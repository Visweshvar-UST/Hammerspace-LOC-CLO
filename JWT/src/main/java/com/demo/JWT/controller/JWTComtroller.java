package com.demo.JWT.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JWTComtroller {
    @GetMapping
    public String welcome(){
        return "<h1>Hello</h1>";
    }
}

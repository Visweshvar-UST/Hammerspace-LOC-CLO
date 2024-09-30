package com.demo.monolithic_spring_security_product_demo.service;

import java.util.List;

import com.demo.monolithic_spring_security_product_demo.dao.AuthUserDoa;
import com.demo.monolithic_spring_security_product_demo.entity.AuthUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthUserService {
    @Autowired
    private AuthUserDoa authUserDoa;

    public List<AuthUser> gatAllAuthUsers(){
        return authUserDoa.findAll();
    }
        
}

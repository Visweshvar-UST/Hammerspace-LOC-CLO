package com.demo.monolithic_spring_security_product_demo.service;

import java.util.Optional;

import com.demo.monolithic_spring_security_product_demo.dao.AuthUserDoa;
import com.demo.monolithic_spring_security_product_demo.entity.AuthUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private AuthUserDoa authUserDoa;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AuthUser> authUser = authUserDoa.findByAuthUserName(username);
        // System.out.println("%%%%%%%%%%%%%%%% : " + authUser.get() +"#########################"+ authUser.get().getAllRoles().toString());
        // but we have return UserDetails and not AuthUser
        // copy auth user data into user details instance
        return authUser
        .map((userInfo)->new CustomUserDetails(userInfo.getAuthUserName(), userInfo.getAuthUserPassword(), userInfo.getAllRoles()))
        .orElseThrow(()-> new UsernameNotFoundException(username + " not found"));

    }

    
}

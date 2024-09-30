package com.demo.JWT.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    // @Bean
    // public UserDetailsService userDetailsService(PasswordEncoder encoder) {
    // 	UserDetails admin = User.withUsername("Emma")
    // 					.password(encoder.encode("Watson"))
    // 					.roles("ADMIN")
    // 					.build();
    // 	UserDetails user = User.withUsername("user123")
    // 					.password(encoder.encode("pass123"))
    // 					.roles("USER, ADMIN")
    // 					.build();
    // 	return new InMemoryUserDetailsManager(admin, user);
    // }

    // @Bean
    // public PasswordEncoder passwordEncoder() {
    //     return new BCryptPasswordEncoder();
    // }

}

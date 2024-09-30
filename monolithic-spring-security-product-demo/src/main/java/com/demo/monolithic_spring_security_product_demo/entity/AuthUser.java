package com.demo.monolithic_spring_security_product_demo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="user_details")
public class AuthUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cred_id")
    private int authUserId;
    @Column(name="cred_name")
    private String authUserName;
    @Column(name = "cred_password")
    private String authUserPassword;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "credential_role", 
    joinColumns = @JoinColumn(name = "cred_id"), 
    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Roles> allRoles;
}

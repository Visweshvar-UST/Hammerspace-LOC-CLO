package com.demo.monolithic_spring_security_product_demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "role_details")
public class Roles {
    @Id
    @Column(name = "role_id")
    private int roleId;
    @Column(name = "role_name")
    private String roleName;
    // public int getRoleId() {
    //     return roleId;
    // }
    // public void setRoleId(int roleId) {
    //     this.roleId = roleId;
    // }
    // public String getRoleName() {
    //     return roleName;
    // }
    // public void setRoleName(String roleName) {
    //     this.roleName = roleName;
    // }

}

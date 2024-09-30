package com.department.department_s1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
// @Getter
// @Setter
@Data
@Entity   
@Table(name = "department_details")
public class Department {
    @Id
    @Column(name = "dept_id")
    private long deptId;
    
    @Column(name = "dept_name")
    private String deptName;

    // public Department() {
    // }

    // public Department(long deptId, String deptName) {
    //     this.deptId = deptId;
    //     this.deptName = deptName;
    // }

    // public long getDeptId() {
    //     return deptId;
    // }

    // public void setDeptId(long deptId) {
    //     this.deptId = deptId;
    // }

    // public String getDeptName() {
    //     return deptName;
    // }

    // public void setDeptName(String deptName) {
    //     this.deptName = deptName;
    // }

}

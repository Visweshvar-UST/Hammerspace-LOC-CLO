package com.employee.Employee_s1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeePojo {
    private Long empId;
    private String empName;
    private Long deptId;
    
    // public EmployeePojo() {
    // }
    // public EmployeePojo(Long id, String name, Long departmentId) {
    //     this.id = id;
    //     this.name = name;
    //     this.departmentId = departmentId;
    // }
    // public Long getId() {
    //     return id;
    // }
    // public void setId(Long id) {
    //     this.id = id;
    // }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public Long getDepartmentId() {
    //     return departmentId;
    // }
    // public void setDepartmentId(Long departmentId) {
    //     this.departmentId = departmentId;
    // }
    
}

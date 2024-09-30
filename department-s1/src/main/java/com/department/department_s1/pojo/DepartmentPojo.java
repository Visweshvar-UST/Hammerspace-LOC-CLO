package com.department.department_s1.pojo;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class DepartmentPojo {
    private long deptId;
    
    private String deptName;

    private List<EmployeePojo> allEmployee;

    
    // public DepartmentPojo() {
    // }

    // public DepartmentPojo(long deptId, String deptName) {
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

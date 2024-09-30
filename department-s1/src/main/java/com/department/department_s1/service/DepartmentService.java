package com.department.department_s1.service;

import java.util.List;

import com.department.department_s1.pojo.DepartmentPojo;


public interface DepartmentService {
    public List<DepartmentPojo> getAllDepartment();
    public DepartmentPojo getADepartment();
    public DepartmentPojo addDepartment();
    public DepartmentPojo updatelDepartment();
    public void deleteDepartment();
}

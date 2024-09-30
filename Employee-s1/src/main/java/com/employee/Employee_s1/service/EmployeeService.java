package com.employee.Employee_s1.service;

import java.util.List;

import com.employee.Employee_s1.entity.Employee;
import com.employee.Employee_s1.pojo.EmployeePojo;

public interface EmployeeService {
    List<EmployeePojo> getAllEmployee();
    EmployeePojo getAEmployee(Long id);
    EmployeePojo addEmployee(EmployeePojo employee);
    EmployeePojo updateEmployee(EmployeePojo employee);
    List<Employee> findByEmpDeptId(Long id);
    void deleteEmployee(Long id);

}

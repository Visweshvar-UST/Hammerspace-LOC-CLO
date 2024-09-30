package com.employee.Employee_s1.controller;

import java.util.List;

import com.employee.Employee_s1.entity.Employee;
import com.employee.Employee_s1.pojo.EmployeePojo;
// import com.employee.Employee_s1.service.EmployeeService;
import com.employee.Employee_s1.service.EmployeeServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl empService;

    @Autowired
    public static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);


    @GetMapping("/employees")
    public List<EmployeePojo> getAllEmployee(){
        LOG.info("%%%%%%%%%%in getAllEmployee%%%%%%%%%%");
        return empService.getAllEmployee();
    }
    
    @GetMapping("/employees/{id}")
    public EmployeePojo getAEmployee(@PathVariable("id") Long id){
        LOG.info("%%%%%%%%%%in getAEmployee%%%%%%%%%%");
        return empService.getAEmployee(id);
    }
    
    @PostMapping("/employees")
    public EmployeePojo addEmployee(@RequestBody EmployeePojo employeePojo){
        LOG.info("%%%%%%%%%%in addEmployee%%%%%%%%%%");
        return empService.addEmployee(employeePojo);
    }
    @PutMapping("/employees")
    public EmployeePojo updateEmployee(@RequestBody EmployeePojo employeePojo){
        LOG.info("%%%%%%%%%%in updateEmployee%%%%%%%%%%");
        return empService.updateEmployee(employeePojo);
    }
    
    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
        LOG.info("%%%%%%%%%%in deleteEmployee%%%%%%%%%%");
        empService.deleteEmployee(id);;
    }
    @GetMapping("/employees/departments/{id}")
	public List<Employee> getAllEmployeesByDepartment(@PathVariable long id){
		return empService.findByEmpDeptId(id);
	}

}

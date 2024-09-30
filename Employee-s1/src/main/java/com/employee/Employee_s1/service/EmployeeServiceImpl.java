package com.employee.Employee_s1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.employee.Employee_s1.dao.EmployeeRepository;
import com.employee.Employee_s1.entity.Employee;
import com.employee.Employee_s1.pojo.EmployeePojo;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository empRepo;

    @Override
    public List<EmployeePojo> getAllEmployee() {
        List<Employee> EmpObj = empRepo.findAll();
        List<EmployeePojo> pojoObj = new ArrayList<>();
        EmpObj.stream().forEach((obj)->{
            EmployeePojo curr = new EmployeePojo();
            BeanUtils.copyProperties(obj, curr);
            pojoObj.add(curr);
        });
        return pojoObj;
    }

    @Override
    public EmployeePojo getAEmployee(Long id) {
        Optional<Employee> obj = empRepo.findById(id);
        EmployeePojo res = null;
        if(obj.isPresent()) {
            res = new EmployeePojo();
            BeanUtils.copyProperties(obj.get(), res);
        }
        return res;
    }

    @Override
    public EmployeePojo addEmployee(EmployeePojo employee) {
        Employee obj = new Employee();
        BeanUtils.copyProperties(employee, obj);
        empRepo.saveAndFlush(obj);
        return employee;
    }
    
    @Override
    public EmployeePojo updateEmployee(EmployeePojo employee) {
        Employee obj = new Employee();
        BeanUtils.copyProperties(employee, obj);
        empRepo.saveAndFlush(obj);
        return employee;
    }

    @Override
    public void deleteEmployee(Long id) {
        Optional<Employee> res = empRepo.findById(id);
        empRepo.delete(res.get());
    }

    @Override
    public List<Employee> findByEmpDeptId(Long id) {
        return empRepo.findByDeptId(id);
    }

    
}

package com.department.department_s1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.department.department_s1.dao.DepartmentRepository;
import com.department.department_s1.entity.Department;
// import com.department.department_s1.entity.Department;
import com.department.department_s1.pojo.DepartmentPojo;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentServiceImpl {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<DepartmentPojo> getAllDepartment(){
        List<Department> depRes = departmentRepository.findAll();
        List<DepartmentPojo> pojoRes = new ArrayList<>();
        depRes.stream().forEach((obj) -> {
            DepartmentPojo curr = new DepartmentPojo();
            BeanUtils.copyProperties(obj, curr);
            pojoRes.add(curr);
        });
        return pojoRes;
    }
    public DepartmentPojo getADepartment(long id){
        Optional<Department> dep = departmentRepository.findById(id);
        DepartmentPojo res = null;
        if(dep.isPresent()){
            res = new DepartmentPojo();
            BeanUtils.copyProperties(dep.get(), res);
        }
        return res;
    }
    public DepartmentPojo addDepartment(DepartmentPojo department){
        Department obj = new Department();
        BeanUtils.copyProperties(department, obj);
        departmentRepository.saveAndFlush(obj); // save
        return department;
    }
    public DepartmentPojo updatelDepartment(DepartmentPojo department){
        Department obj = new Department();
        BeanUtils.copyProperties(department, obj);
        departmentRepository.saveAndFlush(obj);
        return department;
    }
    public void deleteDepartment(Long id){
        Optional<Department> res = departmentRepository.findById(id);
        departmentRepository.delete(res.get());
    }
}

package com.department.department_s1.controller;

import java.util.List;

import com.department.department_s1.pojo.DepartmentPojo;
import com.department.department_s1.pojo.EmployeePojo;
import com.department.department_s1.service.DepartmentService;
import com.department.department_s1.service.DepartmentServiceImpl;

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
import org.springframework.web.client.RestClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@RestController
@RequestMapping("/api")
public class DepertmentController {
    @Autowired
    private DepartmentServiceImpl depSer;

    @Autowired
    public static final Logger LOG = LoggerFactory.getLogger(DepertmentController.class);

    @GetMapping("/departmets")
    public List<DepartmentPojo> getAllDepartment(){
        LOG.info("%%%%%%%%%%%%%%in getAllDepartment%%%%%%%%%%");
        return depSer.getAllDepartment();
    }
    
    @GetMapping("/departmets/{id}")
    @CircuitBreaker(name = "ciremp",fallbackMethod = "empFallBack")
    public DepartmentPojo getADepartment(@PathVariable("id") Long id){
        LOG.info("in getADepartment");
        DepartmentPojo deptPojo = depSer.getADepartment(id);
        RestClient restClient = RestClient.create();
        List<EmployeePojo> allEmps = restClient
        .get()
        .uri("http://localhost:8082/api/employees/departments/"+id)
        .retrieve()
        .body(List.class);
        deptPojo.setAllEmployee(allEmps);

        return deptPojo;
    }
    public DepartmentPojo empFallBack(){   // ------------------------- imp fall back the fallback method will called when it is in close state
        return new DepartmentPojo(0,"Fallback",null);
    }
    
    @PostMapping("/departmets")
    public DepartmentPojo addADepartment(@RequestBody DepartmentPojo department){
        LOG.info("in addADepartment");
        return depSer.addDepartment(department);
    }
    
    @PutMapping("/departmets")
    public DepartmentPojo updateADepartment(@RequestBody DepartmentPojo department){
        LOG.info("in updateADepartment");
        return depSer.updatelDepartment(department);
    }
    @DeleteMapping("/departmets/{id}")
    public void deleteADepartment(@PathVariable("id") Long id){
        LOG.info("in deleteADepartment");
        depSer.deleteDepartment(id);
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}

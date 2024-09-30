package com.employee.Employee_s1.dao;

import java.util.List;

import com.employee.Employee_s1.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	List<Employee> findByDeptId(long deptId);
}

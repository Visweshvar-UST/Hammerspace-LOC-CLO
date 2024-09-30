package com.employee.Employee_s1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeS1Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeS1Application.class, args);
	}

}

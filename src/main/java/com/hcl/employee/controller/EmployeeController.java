package com.hcl.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.employee.Entity.EmployeeEntity;
import com.hcl.employee.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	  @Autowired 
	  EmployeeServiceImpl empServiceImpl;
	  
	  @GetMapping("/getEmployees/{empId}")
	  public EmployeeEntity getEmpDetails(@PathVariable Long empId) {
		  return empServiceImpl.getEmployeeDetails(empId);
	  }
	  
	  @PutMapping("/employee/{empId}")
	  public String updateEmployee(@RequestBody EmployeeEntity empEntity, @PathVariable Long empId) {
		  empServiceImpl.updateEmployee(empEntity,empId);
		  return "Employee Updated successfully...";
		  
	  }
}

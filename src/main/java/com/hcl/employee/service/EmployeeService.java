package com.hcl.employee.service;

import org.springframework.stereotype.Service;
import com.hcl.employee.Entity.EmployeeEntity;
@Service
public interface EmployeeService {

	public EmployeeEntity getEmployeeDetails(Long empId);
	
	public String updateEmployee(EmployeeEntity empEntity, Long empId);
}

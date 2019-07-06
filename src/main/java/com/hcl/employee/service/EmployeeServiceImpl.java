package com.hcl.employee.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hcl.employee.Entity.EmployeeEntity;
import com.hcl.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
EmployeeRepository empRepo;

	@Override
	public EmployeeEntity getEmployeeDetails(Long empId) {
		return empRepo.getEmpById(empId);
	}
	@Override
	public String updateEmployee(EmployeeEntity empEntity, Long empId) {
		//EmployeeEntity empEntity1 =new EmployeeEntity();
		EmployeeEntity emp = empRepo.findById(empId).get();
		emp.setEmpName(empEntity.getEmpName());
		emp.setEmpMobileNo(empEntity.getEmpMobileNo());
		/* if(emp.count(Count>=2)){
		 */
		 empRepo.save(emp);
		return "employee updated successfully....";
	}

}

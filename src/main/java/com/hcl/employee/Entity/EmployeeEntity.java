package com.hcl.employee.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "employee_info")
public class EmployeeEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	private String empName;
	private String empEmail;
	private Long empMobileNo;
	private Date empDOJ;
	private String empDesignation;
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(Long empId, String empName, String empEmail, Long empMobileNo, Date empDOJ,
			String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empMobileNo = empMobileNo;
		this.empDOJ = empDOJ;
		this.empDesignation = empDesignation;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public Long getEmpMobileNo() {
		return empMobileNo;
	}
	public void setEmpMobileNo(Long empMobileNo) {
		this.empMobileNo = empMobileNo;
	}
	public Date getEmpDOJ() {
		return empDOJ;
	}
	public void setEmpDOJ(Date empDOJ) {
		this.empDOJ = empDOJ;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empMobileNo="
				+ empMobileNo + ", empDOJ=" + empDOJ + ", empDesignation=" + empDesignation;
				
	}
}

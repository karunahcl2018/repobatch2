package com.hcl.employee.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sal_info")
public class EmployeeSalEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long salEmpId;
private Double basicSal;
private Double hra;
private Double grossPay;
private Double PF;

@OneToOne
EmployeeEntity empEntity;

public EmployeeSalEntity(Long salEmpId, Double basicSal, Double hra, Double grossPay, Double pF,
		EmployeeEntity empEntity) {
	super();
	this.salEmpId = salEmpId;
	this.basicSal = basicSal;
	this.hra = hra;
	this.grossPay = grossPay;
	PF = pF;
	this.empEntity = empEntity;
}

public Long getSalEmpId() {
	return salEmpId;
}

public void setSalEmpId(Long salEmpId) {
	this.salEmpId = salEmpId;
}

public Double getBasicSal() {
	return basicSal;
}

public void setBasicSal(Double basicSal) {
	this.basicSal = basicSal;
}

public Double getHra() {
	return hra;
}

public void setHra(Double hra) {
	this.hra = hra;
}

public Double getGrossPay() {
	return grossPay;
}

public void setGrossPay(Double grossPay) {
	this.grossPay = grossPay;
}

public Double getPF() {
	return PF;
}

public void setPF(Double pF) {
	PF = pF;
}

public EmployeeEntity getEmpEntity() {
	return empEntity;
}

public void setEmpEntity(EmployeeEntity empEntity) {
	this.empEntity = empEntity;
}

@Override
public String toString() {
	return "EmployeeSalEntity [salEmpId=" + salEmpId + ", basicSal=" + basicSal + ", hra=" + hra + ", grossPay="
			+ grossPay + ", PF=" + PF + ", empEntity=" + empEntity + "]";
}


}

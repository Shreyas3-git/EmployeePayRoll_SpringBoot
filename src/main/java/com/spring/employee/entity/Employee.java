package com.spring.employee.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.spring.employee.dto.EmployeeDTO;

@Entity
@Table(name = "employee_payroll")
public class Employee 
{
	@Id
	@GeneratedValue()
	private int id;
	private String empDept;
	private String empName;
	private String empGender;
	private double empSalary;
	
	public Employee(EmployeeDTO dto) 
	{
		this.empDept = dto.getEmpDept();
		this.empName = dto.getEmpName();
		this.empGender = dto.getEmpGender();
		this.empSalary = dto.getEmpSalary();
	}
	
	public Employee()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
		
	
}

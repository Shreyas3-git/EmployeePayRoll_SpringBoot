package com.spring.employee.dto;

public class EmployeeDTO 
{
	private String empDept;
	private String empName;
	private String empGender;
	private double empSalary;
	
	public EmployeeDTO(String empDept, String empName, String empGender, double empSalary) {
		super();
		this.empDept = empDept;
		this.empName = empName;
		this.empGender = empGender;
		this.empSalary = empSalary;
	}
	
	public EmployeeDTO()
	{
		
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

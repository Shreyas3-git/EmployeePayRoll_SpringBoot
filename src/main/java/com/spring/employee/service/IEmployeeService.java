package com.spring.employee.service;

import java.util.List;

import com.spring.employee.dto.EmployeeDTO;
import com.spring.employee.entity.Employee;

public interface IEmployeeService 
{
	public abstract List<Employee> getAllDetails();
	public abstract Employee getById(int id);
	public abstract Employee insertRecord(EmployeeDTO dto);
	public abstract Employee updateRecord(EmployeeDTO dto,int id);
	public abstract Employee deleteRecord(int id);
}

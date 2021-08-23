package com.spring.employee.service;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.spring.employee.dto.EmployeeDTO;
import com.spring.employee.entity.Employee;
import com.spring.employee.exception.CustomException;
import com.spring.employee.repository.EmployeeRespository;

@Service
public class EmployeeService implements IEmployeeService
{

	@Autowired
	private EmployeeRespository repository;
	
	@Override
	public List<Employee> getAllDetails() 
	{
		List<Employee> entity = new ArrayList<>();
		repository.findAll().forEach(entity :: add);
		return entity;
	}

	@Override
	public Employee getById(int id) 
	{
		return repository.findById(id).orElseThrow(() -> new CustomException("Id not found NoSuchElementException"));
	}

	@Override
	public Employee insertRecord(EmployeeDTO dto) 
	{
		Employee entity = new Employee(dto);
		repository.save(entity);
		return null;
	}

	@Override
	public Employee updateRecord(EmployeeDTO dto, int id) 
	{
		Employee entity = repository.findById(id).orElseThrow(() -> new CustomException("Id Not Found NoSuchElementException:"));
		BeanUtils.copyProperties(dto,entity);
		repository.save(entity);
		return null;
		
//		if (null != dto.getEmpDept() && ! dto.getEmpDept().isEmpty()) 
//		{
//			entity.setEmpDept(dto.getEmpDept());
//		}
//		if (null != dto.getEmpGender() && ! dto.getEmpGender().isEmpty()) 
//		{
//			entity.setEmpGender(dto.getEmpGender());
//		}
//		if (null != dto.getEmpName() && ! dto.getEmpName().isEmpty())
//		{
//			entity.setEmpName(dto.getEmpName());
//		}
//		if (null != dto.getEmpSalary() && ! dto.getEmpSalary().isEmpty()) 
//		{
//			entity.setEmpSalary(dto.getEmpSalary());
//		}
		
	
	}

	@Override
	public Employee deleteRecord(int id) 
	{
		repository.deleteById(id);
		return null;
	}
	
}

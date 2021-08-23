package com.spring.employee.builder;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.spring.employee.dto.EmployeeDTO;
import com.spring.employee.entity.Employee;

@Component
public class EmployeeBuilder 
{
	public Employee addBuilder(EmployeeDTO dto)
	{
		Employee entity = new Employee(dto);
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}
}

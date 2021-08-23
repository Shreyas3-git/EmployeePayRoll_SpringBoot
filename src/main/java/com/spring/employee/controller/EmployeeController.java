package com.spring.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.employee.dto.EmployeeDTO;
import com.spring.employee.dto.ResponseDTO;
import com.spring.employee.entity.Employee;
import com.spring.employee.service.EmployeeService;

@Controller
public class EmployeeController 
{
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/retrive")
	public ResponseEntity<Employee> getAllData()
	{
		List<Employee> entity = service.getAllDetails();
		ResponseDTO dto = new ResponseDTO("Get All Data Successfully (:",entity);
		return new ResponseEntity(dto,HttpStatus.OK);
	}
	
	@GetMapping("/retrive/{id}")
	public ResponseEntity findById(@PathVariable int id)
	{
		Employee entity = service.getById(id);
		ResponseDTO dto = new ResponseDTO("Data retrived successfully",entity);
		return new ResponseEntity(dto,HttpStatus.OK);
	}
	
	@PostMapping("/insert")
	public ResponseEntity addRecord(@RequestBody EmployeeDTO empdto)
	{
		Employee entity = service.insertRecord(empdto);
		ResponseDTO dto = new ResponseDTO("Data inserted successfully:",entity);
		return new ResponseEntity(dto,HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity updateRecord(@RequestBody EmployeeDTO empdto,@PathVariable int id)
	{
		Employee entity = service.updateRecord(empdto, id);
		ResponseDTO dto = new ResponseDTO("Data updated successfully:",entity);
		return new ResponseEntity(dto,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity deleteById(@PathVariable int id)
	{
		Employee entity = service.deleteRecord(id);
		ResponseDTO dto = new ResponseDTO("Data deleted successfully:",entity);
		return new ResponseEntity(dto,HttpStatus.OK);
	}
}

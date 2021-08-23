package com.spring.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.employee.entity.Employee;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee,Integer>
{

}

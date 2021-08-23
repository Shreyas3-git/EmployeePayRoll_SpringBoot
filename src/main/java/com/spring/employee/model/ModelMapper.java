package com.spring.employee.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapper 
{
	@Bean
	 public ModelMapper addModelMapper()
	 {
		return new ModelMapper();
	 }
}

package com.test.embedded.service;

import java.util.List;

import com.test.embedded.model.Employee;
import com.test.embedded.util.EmployeeDto;

public interface EmployeeService {
	
	public List<EmployeeDto> getAllData();
	public EmployeeDto createEmployee(EmployeeDto employee);

}

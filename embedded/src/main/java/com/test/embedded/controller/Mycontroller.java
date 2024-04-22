package com.test.embedded.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.embedded.model.Employee;
import com.test.embedded.serciveimpl.EmployeeServiceImpl;
import com.test.embedded.service.EmployeeService;
import com.test.embedded.util.EmployeeDto;


@RestController
public class Mycontroller {
	
	@Autowired
	private EmployeeService empservice;

	@RequestMapping(value ="/test", method= RequestMethod.GET)
	public ResponseEntity<List<EmployeeDto>> getAllData()
	{
		List<EmployeeDto> list= this.empservice.getAllData();
		return new ResponseEntity<List<EmployeeDto>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value= "/test", method= RequestMethod.POST)
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employee)
	{
		
		System.out.println(employee);
		EmployeeDto emp2= this.empservice.createEmployee(employee);
		return new ResponseEntity<EmployeeDto>(emp2, HttpStatus.CREATED);
	}
	
//	@RequestMapping(value= "/test", method= RequestMethod.POST)
//	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
//	{	
//		System.out.println(employee);
//		Employee emp2= this.empservice.createEmployee(employee);
//		return new ResponseEntity<Employee>(emp2, HttpStatus.CREATED);
//	}

}

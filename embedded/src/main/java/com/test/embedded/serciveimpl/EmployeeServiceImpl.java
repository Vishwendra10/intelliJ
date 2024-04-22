package com.test.embedded.serciveimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.embedded.model.Employee;
import com.test.embedded.model.EmployeeList;
import com.test.embedded.repository.TestRepository;
import com.test.embedded.service.EmployeeService;
import com.test.embedded.util.EmployeeDto;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private TestRepository testrepository;

	public List<EmployeeDto> getAllData() {

		List<Employee> list= this.testrepository.findAll();
		List<EmployeeDto> listdto= list.stream().map(e-> this.empToDto(e)).collect(Collectors.toList());
		return listdto;
	}


	public EmployeeDto createEmployee(EmployeeDto empdto) {

		Employee emp1= dtoToEmp(empdto);
		
		Employee emp= this.testrepository.save(emp1);
		
		EmployeeDto resultempdto = empToDto(emp);
		
		return resultempdto;
	}
	
	public EmployeeDto empToDto(Employee e)
	{
		EmployeeDto dto= new EmployeeDto();
		dto.setEmpid(e.getEmpid());
		dto.setEmpname(e.getEmpname());
		List<Float> listdto= new ArrayList<>();
		for(EmployeeList x: e.getTemp())
		{
			listdto.add(x.getValue());
		}
		dto.setTemp(listdto);
		return dto;
	}
	
	public Employee dtoToEmp(EmployeeDto empdto)
	{
		Employee emp1= new Employee();
		emp1.setEmpid(empdto.getEmpid());
		emp1.setEmpname(empdto.getEmpname());
		
		List<EmployeeList> list1= new ArrayList<>();
		
		for(Float x: empdto.getTemp())
		{
			EmployeeList e= new EmployeeList();
			e.setValue(x);
			list1.add(e);
		}
		emp1.setTemp(list1);
		return emp1;
	}

}

package com.test.embedded.util;

import java.util.ArrayList;
import java.util.List;

import com.test.embedded.model.EmployeeList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeDto {
	
	private int empid;
	private String empname;
	
	List<Float> temp=new ArrayList<>();

	@Override
	public String toString() {
		return "EmployeeListDto [empid=" + empid + ", empname=" + empname + ", temp=" + temp + "]";
	}

}

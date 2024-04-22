package com.training.oopsassg11;

import java.util.Date;

/*Demonstration of ToString() for object printing*/
public class Employee {
	
	int empid;
	String empname;
	String empsalary;
	String empaddress;
	Date empdob;
	Date empdoj;
	
	public Employee (int empid,	String empname,	String empsalary, String empaddress, Date empdob, Date empdoj)
	{
		this.empid=empid;
		this.empname=empname;
		this.empsalary=empsalary;
		this.empaddress=empaddress;
		this.empdob=empdob;
		this.empdoj=empdoj;
	}


	@Override
	public String toString() {
		return "Employee [Employee Id= " + empid + ", Employee Name= " + empname + ", Employee Salary= " + empsalary + ", Employee Address= "
				+ empaddress + ", Employee Date of birth " + empdob + ", Employee Date of joining= " + empdoj + "]";
	}	
}

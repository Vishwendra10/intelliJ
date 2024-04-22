package com.training.ehandlingassg02;

import com.training.exceptions.EmployeeAbscondingException;
import com.training.exceptions.LeaveExceedLimitException;

public class DriverClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		char[] pd1={'L','P','P','P','P','P','P','P','P','P'
				,'P','P','P','P','P','P','P','P','P','P'
				,'P','n','n','n','a','a','P','P','P','L'};
		
		Employee e1= new Employee("Ram", 30000, pd1);
		
		try {
		// Method to convert p,l,a,n to 0,1,2,3 respectively
		e1.mapAttendance();
		//Method to check the exceptions
		e1.checkAttandance();
		//Printing the salary
		System.out.println(e1.name+" gets salary: "+e1.calculateSalary());
		}
		catch(LeaveExceedLimitException le)
			{
			System.out.println("Leave Exceed Limit Exception---");
			System.out.println("Exception :  "+ le);
			}
		catch(EmployeeAbscondingException ae)
			{
			System.out.println("Employee Absconding Exception---");
			System.out.println("Exception :  "+ ae);
			}
	}

}

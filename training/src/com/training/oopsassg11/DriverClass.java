package com.training.oopsassg11;

import java.util.Date;

/*Demonstration of ToString() for object printing*/
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Date object
		Date d1=new Date(2000, 1,3);
		Date d2=new Date(2022, 1,3);
		
		Employee e1= new Employee(01, "Sundar", "20000", "Pune", d1, d2);
		
		System.out.println("Printing Employee details: ");
		System.out.println(e1);

	}

}

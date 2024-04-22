package com.yash.tdd.intassg5;

import java.util.ArrayList;
public class DriverClass {
	
	public static int countNoOfBooks() 
	{
		settingthevalues();
		return Student.count;
	}
	
	public static void settingthevalues()
	{
		Student s1=new Student(01,"Ramesh","A");
		Student s2=new Student(02,"Suresh","B");
		Student s3=new Student(03,"Raghav","C");
		Student s4=new Student(04,"Pratyush","A");
		Student s5=new Student(05,"Yogesh","A");
		
		ArrayList<Student> l= new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countNoOfBooks());

	}

}

package com.training.string;

public class A {
	
	int id;
	String name;
	String salary;
	A()
	{
		System.out.println("A Default");
	}
	A(int id, String name, String salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
//	
//	void m2() 
//	{
//		System.out.println("A private");
//	}
//	
	public static void m3() 
	{
		System.out.println("A static");
	}
//	public final void m4() 
//	{
//		System.out.println("A final");
//	}

}

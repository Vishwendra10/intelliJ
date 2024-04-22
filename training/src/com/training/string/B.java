package com.training.string;

public class B extends A{ 
	B()
	{
		System.out.println("B Default");
	}
	B(int b)
	{
		System.out.println("B Parameterized");
	}
//	B(long b)
//	{
//
//		this();
//		System.out.println("Long");
//	}
//	public void m1() 
//	{ 
//		System.out.println("B method"); 
//	}
//	
//	void m2() 
//	{
//		System.out.println("B private");
//	}
//	
	public static void m3() 
	{
		System.out.println("B static");
	}
//	public final void m4() 
//	{
//		System.out.println("B final");
//	}

}

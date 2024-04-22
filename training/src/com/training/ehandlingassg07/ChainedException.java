package com.training.ehandlingassg07;

public class ChainedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
			{
				code();
			}
		catch(Exception e) 
			{
				System.out.println("Caught: "+ e);
				System.out.println("Caused by: "+ e.getCause());
			}
		

	}
	
	public static void code() 
		{
			 var error= new ArithmeticException("Div by Zero");
			 error.initCause(new NullPointerException());
			 throw error;
		}

}

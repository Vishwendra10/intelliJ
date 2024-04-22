package com.training.oopsassg10;

/*Demonstrating clone method*/
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try 
		{
			Product p1= new Product(01,"Tea", "100", "gm");
			
			//Checking the instance of newly created object
			
			System.out.println("Is P1 object belong to the Product class: ");
			System.out.println(p1 instanceof Product);
			
			//Using clone()-Shallow Copy
			Product p2=(Product)p1.clone();
			
			//Checking the instance of newly created object
			System.out.println("Is P2 object belong to the Product class: ");
			System.out.println(p2 instanceof Product);
			
			//Change in p1 not be reflected in p1
			p2.setPname("Coffee");
			p2.setPrice("150");
			
			//Printing objects
			System.out.println(p1);
			System.out.println(p2);
			
		} 
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		

	}

}

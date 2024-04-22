package com.training.oopsassg08;

/*Demonstrating Inheritance*/
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Electronics e1=new Mobile(01,"Silicon","20-08-2022");
		System.out.println(e1);
		Electronics e2=new Lcd(02,"Germanium","30-08-2022");
		System.out.println(e2);
		Electronics e3=new Laptop(03,"Silicon","10-08-2022");
		System.out.println(e3);
	
	}

}

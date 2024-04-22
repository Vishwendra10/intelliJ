package com.training.oopsassg07;

import java.util.Scanner;

public class DriverClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter first string: ");  
		String str1= sc.nextLine(); 
		
		System.out.print("Enter second string: ");  
		String str2= sc.nextLine(); 
		
		Parent c1= new Child();
		
		if(c1.compareString(str1, str2))
		System.out.println("Strings are equal");
		else
		System.out.println("Strings are not equal");

	}

}

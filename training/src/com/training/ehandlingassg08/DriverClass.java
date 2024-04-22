package com.training.ehandlingassg08;

import java.util.Scanner;

import com.training.exceptions.PasswordFormatException;

public class DriverClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter first string: ");  
		String str1= sc.nextLine();  
		try
		{	
			PasswordStorage p1=new PasswordStorage(str1);
			p1.checkpassword(str1);
		}
		catch(PasswordFormatException pe)
			{
				System.out.println("Password Format Exception : ");
				System.out.println("Exception: "+ pe);
			}
	}

}

package com.training.arrayassg;

import java.util.Scanner;

/*Program to find LCM and HCF*/
public class ArrayAssg07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter first number: ");  
		int num1= sc.nextInt();
		System.out.print("Enter second number: ");
		int num2= sc.nextInt();
		int temp,gcd,lcm;
		int x=num1,y=num2;
		
		//Logic
		while(y!=0)
			{
				temp=y;
				y=x%y;
				x=temp;
			}
		gcd=x;
		lcm=(num1*num2)/gcd;
		
		//Printing LCM and HCF
		System.out.println("HCF of "+num1+" and"+num2+" is: "+gcd);
		System.out.println("LCM of "+num1+" and"+num2+" is: "+lcm);

	}

}

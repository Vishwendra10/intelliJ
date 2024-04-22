package com.training.stringassg;

import java.util.Scanner;

/*Sorting the string in ascending order and in descending order*/

public class StringAssg02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter the string: ");  
		String str1= sc.nextLine();
		
		char[] ch1= str1.toCharArray();
		char[] ch2= str1.toCharArray();
		
		//Sorting in ascending order
		for(int i=0;i<str1.length();i++)
			{
				for(int j=i;j<str1.length();j++) 
					{
						if (ch1[i]>ch1[j])
							{
								char temp=ch1[i];
								ch1[i]=ch1[j];
								ch1[j]=temp;
							}
					}
			}
		
		//Sorting in descending order
		for(int i=0;i<str1.length();i++)
		{
			for(int j=i;j<str1.length();j++) 
				{
					if (ch2[i]<ch2[j])
						{
							char temp=ch2[i];
							ch2[i]=ch2[j];
							ch2[j]=temp;
						}
				}
		}
		
		//Empty strings to hold the strings in ascending and descending order 
		String ascending= "";
		String descending="";
		for(int i=0;i<ch1.length;i++)
		{
			ascending+=ch1[i];
		}
		
		for(int i=0;i<ch2.length;i++)
		{
			descending+=ch2[i];
		}
		
		//Printing the string
		System.out.println("Sorting in ascending order: "+ascending);
		System.out.println("Sorting in descending order: "+descending);
		

	}

}

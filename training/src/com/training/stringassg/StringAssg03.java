package com.training.stringassg;

import java.util.Scanner;


/*Remove all the vovels from the given string*/
public class StringAssg03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter the string: ");  
		String str1= sc.nextLine();
		
		char[] ch= str1.toCharArray();
		
		//String to hold the result
		String result="";
		
		//Logic
		for(int i=0;i<str1.length();i++)
		{
			if(ch[i]=='A' || ch[i]=='a' || 
				ch[i]=='E' ||ch[i]=='e' ||
				ch[i]=='I' ||ch[i]=='i' ||
				ch[i]=='O' ||ch[i]=='o' ||
				ch[i]=='U' ||ch[i]=='u')
			{
				continue;
			}
			else
			{
				result+=ch[i];
			}
		}
		
		//Printing the string without vovels
		System.out.println("String without vovels: ");
		System.out.println(result);

	}

}

package com.training.stringassg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


/*Print the number of alphabets repeated in the string*/
public class StringAssg04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter the string: ");  
		String str1= sc.nextLine();
		
		HashMap<Character, Integer> hm=new HashMap<>();
		
		char[] ch= str1.toCharArray();
		int count=0;
		//Logic implementation using HashMap
		for(int i=0;i<str1.length();i++) 
			{
				if(hm.containsKey(ch[i]))
					{
						hm.put(ch[i], hm.get(ch[i])+1);
						count++;
					}
				else
				{
					hm.put(ch[i], 1);
				}
		}
		
		//Printing the count of elements that are repeated
		System.out.println("Total "+count+" number of element/elements is/are repeated the input string.");

	}

}

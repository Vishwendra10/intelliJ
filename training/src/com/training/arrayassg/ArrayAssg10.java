package com.training.arrayassg;

/*Sorting the string array based on string length*/

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ArrayAssg10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"aaa","b","cccc","ddddd","eeeeee","fffffff"};
		
		for(int i=0; i<str.length;i++)
			{
				for(int j=i;j<str.length;j++)
					{
						if(str[i].length()>str[j].length())
							{
								String temp=str[i];
								str[i]=str[j];
								str[j]=temp;
							}
					}
			}

		//Printing the string array according to length
		System.out.println("Sorting string array according to length : ");
		System.out.println();
		for(String x:str) {
			System.out.print(x+" ");
		}

}
}

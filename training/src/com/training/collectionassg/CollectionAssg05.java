package com.training.collectionassg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/*Demonstrating Vectors in Collections*/
public class CollectionAssg05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter the no. of elements: ");
		Vector<Integer> v1= new Vector<>();
		int size=sc.nextInt();
		System.out.print("Enter the elements: ");
		for(int i=0;i<size;i++)
		{	
			int k=sc.nextInt();
			v1.add(k);
		}
		
		//Sorting in ascending order
		Collections.sort(v1);
		System.out.println(v1);
		

	}

}

package com.training.arrayassg;

import java.util.Scanner;

/*Create a dynamic array */
public class ArrayAssg03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");  
		int size=sc.nextInt();
		
		if(size>0) 
		{
			int[] arr=new int[size];
			System.out.print("Enter the elements of array: "); 
			for(int i=0;i<size;i++)
				{
					arr[i]=sc.nextInt();
				}
			
			System.out.println();
			//Printing the elements of array
			System.out.println("Array Elements: ");
			System.out.println();
			for(int i=0; i<size;i++)
			{
				System.out.print(arr[i]+" ");
			}
			
			System.out.println();
			System.out.println("Enter the number of new elements you want to store: ");
			int newsize=sc.nextInt();
			
			int totalindex=size+newsize;
			int[] newarr=new int[totalindex];
			
			//Copying the old array to new array
			for(int i=0;i<size;i++)
				{
				newarr[i]=arr[i];
				}
			
			
			
			System.out.println("Enter the new elements of array: ");
			
			
			//Adding the new elements
			for(int j=size;j<(size+newsize);j++)
				{
				newarr[j]=sc.nextInt();
				}
			
			System.out.println();
			//Printing the elements of array
			for(int i=0; i<totalindex;i++)
			{
				System.out.print(newarr[i]+" ");
			}
		}
		
		
	}

}

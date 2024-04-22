package com.training.arrayassg;

import java.util.HashSet;

/*Pythagoras templates*/

public class ArrayAssg04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] square=new int[arr.length];
		
		//Set to hold the indexes of the elements which satisfy pythagoras theorem
		HashSet<Integer>set1=new HashSet<>();
		
		//Creating new array of squares of the elements
		for(int i=0;i<arr.length;i++)
			{
				square[i]=arr[i]*arr[i];
			}
		
		//Printing the array elements
		System.out.println();
		System.out.println();
		for(int x:arr)
			{
			System.out.print(x+" ");
			}
		System.out.println();
		System.out.println();
		
		//Logic to hold the indexes of elements which satisfy the pythagoras theorem
		for(int i=0;i<arr.length;i++)
			{	
				for(int j=0;j<arr.length;j++)
					{	
						if(i==j) {continue;}
						int sum=square[i]+square[j];
						
						for(int k=0;k<arr.length;k++)
							{
								if(sum==square[k])
								{
									set1.add(i);
									set1.add(j);
									set1.add(k);
								}
							}
					}
			}
		
		//Printing the elements which satisfy pythagoras template
		System.out.println();
		System.out.println("The elements presents in array which satisfy pythagoras template: ");
		for(int x: set1)
			{
				System.out.print(arr[x]+" ");
			}
	}

}

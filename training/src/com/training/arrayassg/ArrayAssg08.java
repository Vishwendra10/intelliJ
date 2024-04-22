package com.training.arrayassg;


/*Arrange all the vovels from the list on the left and all the consonents on right*/
public class ArrayAssg08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','v','i','t','o','u','k','l'};
		
		char[] result= new char[arr.length];
		int start=0,last=arr.length-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='A' || arr[i]=='a' || 
				arr[i]=='E' ||arr[i]=='e' ||
				arr[i]=='I' ||arr[i]=='i' ||
				arr[i]=='O' ||arr[i]=='o' ||
				arr[i]=='U' ||arr[i]=='u')
			{
				result[start]=arr[i];
				start++;
			}
			else
			{
				result[last]=arr[i];
				last--;
			}
		}
		
		//Printing the result
		System.out.println("All vovels are on left and all consonents are on right: ");
		for(char x: result){
			System.out.print(x+" ");
		}

	}

}

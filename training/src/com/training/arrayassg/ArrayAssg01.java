package com.training.arrayassg;

/*Program to find the third maximum number*/
public class ArrayAssg01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] list1= {23,45,66,78,3,90};
		
		//Sorting the elements
		for(int i=0;i<list1.length;i++) 
			{
				for(int j=i;j<list1.length;j++)
					{
						if(list1[i]<list1[j])
							{
								int temp=list1[i];
								list1[i]=list1[j];
								list1[j]=temp;
							}
					}
			}
		
		//Printing the 3rd highest
		System.out.println("Third maximum number is: "+ list1[2]);
		

	}
}

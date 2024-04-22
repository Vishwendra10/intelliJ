package com.training.arrayassg;

/*Sort the array on the basis of unit places*/
public class ArrayAssg12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {10,2,3,41,12,13,19,81,9};
		int n=arr.length;
		
		//Printing the original array
		System.out.println("Array before sorting: ");
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
		
		//logic
		for(int i=0;i<n;i++)
			{
				for(int j=i;j<n;j++)
					{
						if((arr[i]%10) > (arr[j]%10))
							{
								int temp= arr[i];
								arr[i]=arr[j];
								arr[j]=temp;
							}
					}
			}
		
		
		//Printing sorted array
		System.out.println();
		System.out.println();
		System.out.println("Sorted array output based on unit places: ");
		for(int x: arr)
			{
				System.out.print(x+" ");
			}

	}

}

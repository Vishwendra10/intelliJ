package com.training.arrayassg;

/*Sort half array in ascending order and half in descending order*/
public class ArrayAssg06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {2,1,4,6,40,8,5};
		int mid=arr.length/2;
		int j=0;
		
		//Taking first half array in left array and other half in right array
		int[] left= new int[mid];
		int[] right = new int[arr.length-mid];
		
		
		//Array to hold the result
		int[]result=new int[arr.length];
		
		for(int i=0; i<arr.length;i++)
			{
				if(i<mid)
					{
						left[i]=arr[i];
					}
				else
					{
						right[j]=arr[i];
						j++;
					}
			}
		ascSort(left);
		descSort(right);

	}
	
	//Function for sorting first half of array in ascending order
	public static void ascSort(int[] left)
		{

		for(int i=0;i<left.length;i++)
			{
				for(int j=i;j<left.length;j++)
					{
						if(left[i]>left[j])
							{
								int temp=left[i];
								left[i]=left[j];
								left[j]=temp;
							}
					}
			}
		//Printing the first half of the sorted array
		for(int x: left)
			{
				System.out.print(x+" ");
			}
			
		}
	
	//Function for sorting last half of array in descending array
	public static void descSort(int[] right)
		{
		for(int i=0;i<right.length;i++)
		{
			for(int j=i;j<right.length;j++)
				{
					if(right[i]<right[j])
						{
							int temp=right[i];
							right[i]=right[j];
							right[j]=temp;
						}
				}
		}
		////Printing the last half of the sorted array
		for(int x: right)
			{
				System.out.print(x+" ");
			}
			
		}

}

package com.training.arrayassg;

/*Print count of  Even, Odd, Perfect and Prime numbers from an array*/
public class ArrayAssg05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,6,7,8,9,28,496};
		int n=arr.length;
		int evencount=0, oddcount=0, primecount=0, perfectcount=0;
		for(int i=0;i<n;i++)
			{
				int temp=0;
				int sum=0;
				//Logic for even number
				if(arr[i]%2==0)
					{
						evencount++;
					}
				//Logic for odd number
				if(arr[i]%2!=0)
					{
						oddcount++;
					}
				//0 and 1 is neither perfect nor prime so skip the iteration
				if(arr[i]==0 || arr[i]==1)
					{
						continue;
					}
				//Finding the divisors
				for(int j=1;j<=arr[i];j++)
					{
						if(arr[i]%j==0)
							{
								temp++;
								sum+=j;
							}
						
					}
				//Logic for perfect number
				if((sum-arr[i])==arr[i])
				{
					perfectcount++;
				}
				//Logic for prime number
				if(temp==2) 
					{
						primecount++;
					}
			}
		
		//Printing the counts of respective numbers
		System.out.println("Even count: "+evencount+" Odd count: "+oddcount+" Perfect count: "+perfectcount+" Prime count: "+primecount);

	}

}

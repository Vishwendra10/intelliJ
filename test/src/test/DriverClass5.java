package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverClass5 {
	public static void main(String[] args)
	{
		int[] arr= {1,2,3};
		int n=arr.length;
		if(n==1)
	       {
	           System.out.println(0);;
	       }
	       else if(n==2)
	       {
	           int x= (arr[0]>=arr[1])?0:1;
	           System.out.println(x);
	       }
	       else
	       {
	           if(arr[0]>=arr[1])
	           {
	               System.out.println(0);
	           }
	           if(arr[n-1]>=arr[n-2])
	           {
	                System.out.println(n-1);               
	           }
	           for(int i=1;i<n-1;i++)
	           {
	               if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
	               {
	                   System.out.println(i);
	               }
	           }
	           
	       }
	}

}

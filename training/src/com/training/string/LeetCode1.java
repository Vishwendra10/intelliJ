package com.training.string;

import java.util.Arrays;

public class LeetCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {2,2,1,1,1,2,2};
		
		int res=0,count=0;
		
		for(int x:nums)
		{
			if(count==0)
			{
				res=x;
			}
			if(x!=res)
			{
				count--;
			}
			else
			{
				count++;
			}
		}
		
		System.out.println(res);
	}
}

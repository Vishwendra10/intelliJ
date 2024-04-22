package com.training.ehandlingassg10;

import java.util.ArrayList;

public class Child extends Parent {
	
	public Child(ArrayList<Integer> list1)
	{
		l1.addAll(list1);
	}
	
	public void calculateMaximum() throws NullPointerException,NumberFormatException
	{
		int max=l1.get(0);
		int avg,sum=0;
		for(int i=0;i<l1.size();i++)
			{
				if(l1.get(i)>max)	
					{
						max=l1.get(i);
					}
				sum+=l1.get(i);
			}
		avg=sum/l1.size();
		System.out.println("Average: "+avg);
		System.out.println("Maximum: "+max);
	}

}

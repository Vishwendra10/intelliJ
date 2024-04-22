package com.training.ehandlingassg10;

import java.util.ArrayList;
import java.util.List;

public class Parent {
	
	List<Integer> l1= new ArrayList<>();
	
	public Parent() {}
	public Parent(ArrayList<Integer> list1)
		{
			l1.addAll(list1);
		}
	
	public void calculateMaximum() throws NullPointerException,ArrayIndexOutOfBoundsException
		{
			int max=l1.get(0);
			for(int i=0;i<l1.size();i++)
				{
					if(l1.get(i)>max)	
						{
							max=l1.get(i);
						}
				}
			System.out.println("MaximumP: "+max);
		}

}

package com.training.ehandlingassg10;

import java.util.ArrayList;

public class DriverClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list1= new ArrayList<>();
		list1.add(0);
		list1.add(10);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(7);
		list1.add(5);
		list1.add(6);
		Parent p1= new Parent(list1);
		try
			{
				p1.calculateMaximum();
			}
		catch(NullPointerException ne)
			{
				System.out.println("Null pointer exception: ");
				System.out.println("Exception: "+ ne);
			}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Array Index Out Of Bounds Exception: ");
			System.out.println("Exception: "+ ae);
		}
		catch(NumberFormatException nf)
		{
			System.out.println("Number Format Exception: ");
			System.out.println("Exception: "+ nf);
		}

	}

}

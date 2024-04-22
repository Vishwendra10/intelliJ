package com.training.collectionassg;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionAssg02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a1= new ArrayList<>();
		int element=20;
		
		a1.add(20);
		a1.add(60);
		a1.add(8);
		a1.add(10);
		a1.add(100);
		a1.add(44);
		
		Collections.sort(a1);
		
		int start=0, last=(a1.size()-1);
		int indexofelement= Collections.binarySearch(a1, element);
		System.out.println("Arraylist After sorting: ");
		System.out.println(a1);
		
		if(indexofelement>0)
			{
				System.out.println("Inserted element found at: "+ (indexofelement+1)+" index");
			}
		else
		System.out.println("Element not found");
		
	}
}

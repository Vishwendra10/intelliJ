package com.training.collectionassg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionAssg01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(5);
		a1.add(8);
		a1.add(30);
		a1.add(1);
		a1.add(2);
		a1.add(3);

		Collections.sort(a1);
		
		System.out.println(a1);
	}

}

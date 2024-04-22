package com.training.collectionassg;

/*Sorting in HashMap based on keys present in HashMap*/

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionAssg06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm= new HashMap<>();
		hm.put("Pune", 40000);
		hm.put("Delhi", 50000);
		hm.put("Mumbai", 30000);
		hm.put("Banglore", 50000);

		Set s1=hm.entrySet();
		List<Entry<String,Integer>> l1=new LinkedList<Entry<String,Integer>>(hm.entrySet());
		
		//Sorting  based on key in ascending order
		Collections.sort(l1 , new Comparator<Entry<String,Integer>>()
					{
						public int compare(Entry<String,Integer> o1, Entry<String,Integer> o2)
							{
								return o1.getKey().compareTo(o2.getKey());
							}
					});
		
		System.out.println(l1);

	}

}

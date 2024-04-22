package com.training.collectionassg;

/*Remove duplicate and arrange the array in descending order*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CollectionAssg04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter the no. of elements of arraylist: ");
		ArrayList<Integer> a1= new ArrayList<>();
		ArrayList<Integer> duplicate= new ArrayList<>();
		int size=sc.nextInt();
		System.out.print("Enter the elements of arraylist: ");
		for(int i=0;i<size;i++)
		{	
			int k=sc.nextInt();
			a1.add(k);
		}
		HashMap<Integer, Integer> hm= new HashMap<>();
		for(Integer x: a1)
			{
				if(hm.containsKey(x))
					{
						hm.put(x, hm.get(x)+1);
					}
				else
					{
						hm.put(x, 1);
					}
			}
		Set s1=hm.entrySet();
		Iterator itr= s1.iterator();
		while(itr.hasNext())
			{
				Map.Entry m1= (Map.Entry) itr.next();
				if((int)m1.getValue()>1)
					{
						//adding the duplicate elements in duplicate array
						duplicate.add((int)m1.getKey());
					}
			}
		
		//removing the duplicate elements from original array
		for(Integer x: duplicate)
			{
				if(a1.contains(x))
					{
						a1.remove(x);
					}
				
			}
		//Sorting the array in descending order
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println(a1);

	}
	

}

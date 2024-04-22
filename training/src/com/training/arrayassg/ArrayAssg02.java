package com.training.arrayassg;

/*Duplicate numbers in list and their count*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ArrayAssg02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] list1= {23,45,66,78,3,90,3,90};
		HashMap<Integer, Integer> hm=new HashMap<>();
		
		
		for(int i=0;i<list1.length;i++) 
			{
				if(hm.containsKey(list1[i]))
					{
						hm.put(list1[i], hm.get(list1[i])+1);
					}
				else
				{
					hm.put(list1[i], 1);
				}
		}
		
		//Printing the elements and their counts using iterator
		Set s1=hm.entrySet();
		Iterator itr= s1.iterator();
		System.out.println("Duplicate number in the array and their count:");
		while(itr.hasNext())
		{
			Map.Entry m= (Map.Entry) itr.next();
			if((int)m.getValue()>1)
				{
					System.out.println(m.getKey()+"->"+m.getValue());
				}
		}


	}

}

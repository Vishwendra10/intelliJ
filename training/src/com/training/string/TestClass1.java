package com.training.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,2,3,4,4,4,5,5,6,8};
		ArrayList<Integer> al= new ArrayList<>();
        HashMap<Integer,Integer> hm= new HashMap<Integer, Integer>();
        for(int i=0;i<array.length;i++)
        {
            if(hm.containsKey(array[i]))
            {
                hm.put(array[i],hm.get(array[i])+1);
            }
            else
            {
                hm.put(array[i],1);
            }
        }
        hm.forEach((k,v)->{
        	al.add(k);
        		});
        
        System.out.println(al);
	}
}

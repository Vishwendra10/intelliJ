package com.training.string;

import java.util.HashMap;
import java.util.Map;

public class PrimaryClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		new AA();
//		AA a=new  AA();
//		System.out.println();
////		a.prints();
//		BB b= (BB)a;
//		b.prints();

Map<Integer, String> map= new HashMap<>();
map.put(1, "String 1");
map.put(2, "String 2");
map.put(3, "String 3");
map.put(4, "String 4");

for(int i=0;i<map.size();i++) 
{
	System.out.println(map.get(i+1));
}

//		b.prints();
		
	}

}

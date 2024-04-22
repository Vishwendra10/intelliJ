package com.training.stringassg;

/*Demonstration that StringBuilder is faster than StringBuffer*/

public class StringAssg05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Storing the current time for StringBuilder
		long sbdt=System.currentTimeMillis();
		
		
		StringBuilder sbd= new StringBuilder("Time");
		for(int i=0;i<10000;i++) 
		{
			sbd.append(" test");
		}
		
		//Printing the time consumed by StringBuilder
		System.out.println("String builder time consumed: "+ (System.currentTimeMillis()-sbdt));
		
		
		//Storing the current time for StringBuffer
		long sbft=System.currentTimeMillis();
		StringBuffer sbf= new StringBuffer("Testing");
		for(int i=0;i<10000;i++) 
		{
			sbf.append(" test");
		}
		
		//Printing the time consumed by StringBuffer
		System.out.println("String buffer time consumed: "+ (System.currentTimeMillis()-sbft));

		//String builder is faster then string buffer because it is asynchronous
		
	}

}

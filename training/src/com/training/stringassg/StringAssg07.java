package com.training.stringassg;


/*Demonstration on working of Garbage collector*/
public class StringAssg07 {
	
	//Finalize() is used each time before garbage is collected to perform cleanup activity.
	public void finalize() {
		System.out.println("Object has been garbage collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating the object
		StringAssg07 s1= new StringAssg07();
		StringAssg07 s2= new StringAssg07();
		StringAssg07 s3= new StringAssg07();
		
		String s= new String();
		System.out.println(s.hashCode());
		
		// Object pointing to new reference
		s2=s3;
		
		// Pointing the object to null
		s1= null;
		
		//Explicitly calling gc() to collect the object which is not being referred
		//Remove the unreferenced object.
		System.gc();
		

	}

}

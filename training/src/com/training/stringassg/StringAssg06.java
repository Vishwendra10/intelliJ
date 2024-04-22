package com.training.stringassg;

/*Demonstration of how memory is allocated in heap and String constant pool*/
public class StringAssg06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1="Yash";
		String name2="Yash"; 
		// It does not create a new string instance. As "Yash" is present in String constant pool, a referenced to the pooled instance is returned.
		// Only one object will be created.
		
		String name3= new String("Yash");
		String name4= new String("Yash");
		//Two objects will be created with new keyword.
		
		

		System.out.println("Name1 hashcode: "+name1.hashCode());
		System.out.println("Name2 hashcode: "+name2.hashCode());
		System.out.println("Name3 hashcode: "+name3.hashCode());
		System.out.println("Name4 hashcode: "+name4.hashCode());
		
		
		
		System.out.println(name1==name2);
		//True because both refer to the same instance.
		
		System.out.println(name1.equals(name2));
		// True because the value is same in string constant pool.
		
		System.out.println(name1==name3);
		// False because name3 refer to the instance created in heap memory.
		
		System.out.println(name1.equals(name3));
		// True because the value is same in string constant pool.
		
		System.out.println(name3==name4);
		// False because name3 and name4 refers to the different instances in heap memory.
		
		System.out.println(name3.equals(name4));
		// True because the value is same in string constant pool.
		

	}

}

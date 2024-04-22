package com.training.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DriverCass{
	public static void main(String [] args) {
	A b= new B();
	b.m3();
//		ThreadExample1 t1= new ThreadExample1();
//		// start() -- java.lang.Thread
//		//in order to run the run() we need to take help of Thread Class bcz Thread class has the Start()
//		Thread thread= new Thread(t1);
//		thread.start();
//		
//		ThreadExample2 t2= new ThreadExample2();
//		t2.start();

//		A a1=new A();
//		A a2=new A(10);
//		B b1=new B(10);
//		B b2=new B();
		
		
//		B b=new A();
//		B a5= new A(10);
		
		
		
		
//		A b = (C) d;
		
//		1) compiler check: (C) d -> parent to child or child to parent
//	 	2) compiler check: b= (C) d -> A type = C type OR C is child of A
//	 	3) runtime checking: d should be same as C or d is child of C
//									C Type reference, d runtime object
		
		
		
		
		
		
//		String o= new String("Vish");
//	
//		StringBuffer sb=(StringBuffer) o;
//		
//		System.out.println(sb);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Object o= new String("Vish");
//	
//		String sb=(Object) o;
//		
//		System.out.println(sb);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Object o= new String("Vish");
//
//		StringBuffer sb= (StringBuffer) o;
//		
//		System.out.println(sb);
		
		

		
		
		
		
//		Object o= new String("Vish");
//
//		String sb= (String) o;
//		
//		System.out.println(sb);
		
		
		
		
		
		
		
//		A a=new B();
//		B b=(B) a;
//		
//		a.m1();
//		System.out.println();
//		b.m1();
		
		
//		A a4= new B(10);
		
//		String s= new String ("abc");
//		
//		String sb= new String("abc");
	
//		A a= new A(1,"abc","20000");
//		A a1= new A(2,"abc","20000");
//		A a2= new A(3,"abc","20000");
//		A a3= new A(1,"abc","20000");
		
//		String s=new String("xx");
//		String s1=new String("xx");
//		
//		System.out.println(s==s1);
//		System.out.println(s.equals(s1));
		
//		System.out.println(a==a3);
//		System.out.println(a3.equals(a));
//		
//		
//		
//		HashMap<A,Integer> hm=new HashMap<>();
//		hm.put(a, 1);
//		hm.put(a1, 1);
//		hm.put(a2, 1);
//		hm.put(a3, 2);
//		
//		hm.forEach((K,V)->System.out.println(K+" "+V));
		

//
//		IS1 mul=(a, b)-> {System.out.println(a*b);};
//		
//		mul.multiply(10,20);
		
		
		
		Employee e1= new Employee(1,"abc",20000);
		Employee e2= new Employee(2,"abc2",20000);
		Employee e3= new Employee(3,"abc3",20000);
		Employee e4= new Employee(4,"abc4",20000);
		
		List<Employee> list= new ArrayList<>();
		List<Integer> list2= new ArrayList<>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);
		


//		list.stream().map(e->e.getName()).forEach(System.out::println);
//		System.out.println();
//		List<String> result2= list.stream().map(Employee::getName).collect(Collectors.toList());
//		result2.forEach(System.out::println);



}
}

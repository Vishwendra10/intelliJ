package com.training.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> a= new ArrayList<>();
		
//		a.add(new Product(01, "a", 9000));
//		a.add(new Product(02, "b", 4000));
//		a.add(new Product(03, "c", 5000));
//		a.add(new Product(04, "d", 3000));.
		
		Product p1=new Product(01, "a", 9000);
		Product p2=new Product(01, "a", 9000);
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
//		a.add(new Product(03, "c", 5000));
//		a.add(new Product(04, "d", 3000));.
		
//		
//		System.out.println("Product details whose price is more than 4000");
//		for(Product p:a)
//			{
//				if(p.getPrice()>4000) 
//				{
//				System.out.println(p);
//				}
//			}
//		System.out.println();
//		System.out.println("Product details of procuct whose price is more than 4000 using JDK 8");
//		
//		List<Product>result=a.stream().filter(e->e.price>4000).collect(Collectors.toList());
//		result.forEach(System.out::println);
//		List<Float> result= a.stream().map(e->{return e.price;}).sorted(Comparator.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
//		result.forEach(System.out::println);
//		List<Object> product=productprice.stream().sorted(Comparator.reverseOrder()).limit(1).collect(Collectors.toList());
//		System.out.println();
//		product.forEach(System.out::println);
		
	}

}

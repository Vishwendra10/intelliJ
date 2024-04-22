package com.yash.pms;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.pms.model.Product;
import com.yash.pms.service.ProductService;
import com.yash.pms.serviceimpl.ProductServiceImpl;
import com.yash.pms.util.Constant;

/**
 * Console based product management system
 * @author vishwendra.singh
 *
 */

public class App 
{
	
    public static void main( String[] args )
    {
    	//calling bean
    	ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");  
		ProductServiceImpl productservice=context.getBean("impl",ProductServiceImpl.class);
	
    boolean flag=true;
    while(flag) {
    	Scanner sc= new Scanner(System.in); 
    	String i=Constant.STR_EMPTY;
    	System.out.println();
		System.out.print("Select options: "); 
		System.out.println("1) Get all product list ");
		System.out.println("2) Get specific product detail by id ");
		System.out.println("3) Add new product details ");
		System.out.println("4) Delete product by id  ");
		System.out.println("0) Exit");
		i=sc.next();
		
		//using switch to explore menu 
		switch(i)
			{
			case Constant.STR_1: 
				System.out.println(productservice.getDetails());
				break;
			
		case Constant.STR_2:
			System.out.println("Enter ID: ");
			int id= sc.nextInt();
			System.out.println(productservice.getDetailsById(id));
			break;
			
			
		case Constant.STR_3:
			System.out.println("Enter product ID: ");
			int id1= sc.nextInt();
			System.out.println("Enter product name: ");
			String name= sc.next(); 
			System.out.println("Enter product price: ");
			double price= sc.nextDouble();
			
			Product data=new Product(id1,name,price);
			
			System.out.println(productservice.save(data));
			System.out.println("Details added");
			break;
			
		case Constant.STR_0:
			flag=false;
			break;
			
			
			
		case Constant.STR_4:
			System.out.println("Enter ID: ");
			int delid= sc.nextInt();
			System.out.println(productservice.delete(delid));
			System.out.println("Details deleted");
			break;
			
			}
    	
    }
    }
}

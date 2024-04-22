package com.yash.tdd.intassg6;
/**
 * @author vishwendra.singh
 */
import java.util.ArrayList;

public class DriverClass {
	
	public static void settingthevalues()
	{
		Author a1=new Author(01,"Java",100,"Programming qustions");
		Author a2=new Author(02,"MySql",80,"Programming qustions");
		Author a3=new Author(03,"Java8",100,"Theory");
		Author a4=new Author(04,"NoSql",200,"MCQ");
		
		ArrayList<Author> l= new ArrayList<>();
		l.add(a1);
		l.add(a2);
		l.add(a3);
		l.add(a4);
	}
	
	public static int countNoOfBooks() 
	{
		settingthevalues();
		return Author.count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countNoOfBooks());
	}


}

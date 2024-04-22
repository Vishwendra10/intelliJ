package com.training.collectionassg.collectionassg07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Student s1= new Student(01,"abc","10",300);
		 Student s2= new Student(02,"aaa","10",400);
		 Student s3= new Student(03,"bbb","10",200);
		 Student s4= new Student(04,"ddd","10",450);
		 Student s5= new Student(05,"eee","10",50);
		 
		 ArrayList<Student> l1= new ArrayList<Student>();
		 l1.add(s1);
		 l1.add(s2);
		 l1.add(s3);
		 l1.add(s4);
		 l1.add(s5);
		 
		 //calling method top three students
		 topThreeStudents(l1);
		 System.out.println();
		 //calling method for students details having below 50%
		 marksBelowFifty(l1);
		 System.out.println();
		 //calling method for students details having marks more than average marks
		 aboveAverageStudentDetails(l1);
		 System.out.println();
		 //calling method for students details having below 35%
		 marksBelowThirtyfive(l1);
		 System.out.println();
		 //Sorting based on names
		 sortingBasedOnNames(l1);
		 
		 
	}
	
	//Method to calculate top three students
	public static void topThreeStudents(ArrayList<Student> l1)
		{	
			System.out.println("Top three students: ");
			
			//Sorting based on marks
			Collections.sort(l1, new Comparator<Student>(){
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				Integer i1= o1.getTotalmarks();
				Integer i2=o2.getTotalmarks();
				return i2.compareTo(i1);
			}
			});
			
			
			for(int i=0;i<3;i++)
				{	
					System.out.println(l1.get(i));
				}
		}
	public static void marksBelowFifty(ArrayList<Student> l1)
		{
			System.out.println("Student details who scored less than 50%: ");
			
			for(int i=0;i<l1.size();i++)
				{
					float f1=l1.get(i).calculatePercentage();
					if(f1<50.0) 
						{
						System.out.println(l1.get(i));
						}
				}
		}
	public static void marksBelowThirtyfive(ArrayList<Student> l1)
		{	
			System.out.println("Student details who scored less thn 35%: ");
			
			for(int i=0;i<l1.size();i++)
			{
				float f1=l1.get(i).calculatePercentage();
				if(f1<35.0) 
					{
					System.out.println(l1.get(i));
					}
			}
		}
	
	public static void aboveAverageStudentDetails(ArrayList<Student> l1)
		{
			System.out.println("Printing Student details who's marks are above average: ");
			int avg,sum=0;
			//Calculating average
			for(int i=0;i<l1.size();i++)
				{
					sum+=l1.get(i).getTotalmarks();
				}
			avg=sum/l1.size();
			
			//Printing student details having marks more than average 
			for(int i=0;i<l1.size();i++)
				{	
					if(l1.get(i).getTotalmarks()>avg)
						{
							System.out.println(l1.get(i));
						}
				}
		}
	
	public static void sortingBasedOnNames(ArrayList<Student> l1)
		{
			System.out.println("Student details based on names: ");
			//Sorting based on names
			Collections.sort(l1, new Comparator<Student>(){
				 public int compare(Student o1, Student o2) {
						// TODO Auto-generated method stub
						String i1= o1.getSname();
						String i2=o2.getSname();
						return i1.compareTo(i2);
					}
			 });
			for(Student x: l1) 
				{
					System.out.println(x);
				}
		}

}



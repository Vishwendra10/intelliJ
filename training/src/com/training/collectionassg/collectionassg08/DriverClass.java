package com.training.collectionassg.collectionassg08;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] itemname= {"a","b"};
		ProductionFacility p1d1= new ProductionFacility(01,"Facility 01","Pune",100 ,itemname , LocalDate.of(2019, 01, 13));
		ProductionFacility p1d2= new ProductionFacility(01,"Facility 01","Pune",150 ,itemname , LocalDate.of(2019, 01, 14));
		ProductionFacility p1d3= new ProductionFacility(01,"Facility 01","Pune",130 ,itemname , LocalDate.of(2019, 01, 15));
		
		ProductionFacility p2d1= new ProductionFacility(02,"Facility 02","Pune",200 ,itemname , LocalDate.of(2017, 01, 13));
		ProductionFacility p2d2= new ProductionFacility(02,"Facility 02","Pune",150 ,itemname , LocalDate.of(2019, 01, 14));
		ProductionFacility p2d3= new ProductionFacility(02,"Facility 02","Pune",130 ,itemname , LocalDate.of(2019, 01, 15));
		
		ProductionFacility p3d1= new ProductionFacility(03,"Facility 04","Pune",150 ,itemname , LocalDate.of(2020, 01, 13));
		ProductionFacility p3d2= new ProductionFacility(03,"Facility 04","Pune",150 ,itemname , LocalDate.of(2019, 01, 14));
		ProductionFacility p3d3= new ProductionFacility(03,"Facility 04","Pune",130 ,itemname , LocalDate.of(2019, 01, 15));
		
		ProductionFacility p4d1= new ProductionFacility(04,"Facility 03","Pune",120 ,itemname , LocalDate.of(2016, 01, 13));
		ProductionFacility p4d2= new ProductionFacility(04,"Facility 03","Pune",150 ,itemname , LocalDate.of(2019, 01, 14));
		ProductionFacility p4d3= new ProductionFacility(04,"Facility 03","Pune",130 ,itemname , LocalDate.of(2019, 01, 15));
		
		ProductionFacility p5d1= new ProductionFacility(05,"Facility 05","Pune",500 ,itemname , LocalDate.of(2015, 01, 13));
		ProductionFacility p5d2= new ProductionFacility(05,"Facility 03","Pune",150 ,itemname , LocalDate.of(2019, 01, 14));
		ProductionFacility p5d3= new ProductionFacility(05,"Facility 03","Pune",130 ,itemname , LocalDate.of(2019, 01, 15));
		
		ArrayList<ProductionFacility> l1= new ArrayList<>();
		l1.add(p1d1);
		l1.add(p1d2);
		l1.add(p1d3);
		l1.add(p2d1);
		l1.add(p2d2);
		l1.add(p2d3);
		l1.add(p3d1);
		l1.add(p3d2);
		l1.add(p3d3);
		l1.add(p4d1);
		l1.add(p4d2);
		l1.add(p4d3);
		l1.add(p5d1);
		l1.add(p5d2);
		l1.add(p5d3);
		
		int[] avg=new int[5];
		avg[0]= ProductionFacility.avgOfThreeDays(p1d1.totalproduction_perday, p1d2.totalproduction_perday,p1d3.totalproduction_perday);
		avg[1]= ProductionFacility.avgOfThreeDays(p2d1.totalproduction_perday, p2d2.totalproduction_perday,p2d3.totalproduction_perday);
		avg[2]= ProductionFacility.avgOfThreeDays(p3d1.totalproduction_perday, p3d2.totalproduction_perday,p3d3.totalproduction_perday);
		avg[3]= ProductionFacility.avgOfThreeDays(p4d1.totalproduction_perday, p4d2.totalproduction_perday,p4d3.totalproduction_perday);
		avg[4]= ProductionFacility.avgOfThreeDays(p5d1.totalproduction_perday, p5d2.totalproduction_perday,p5d3.totalproduction_perday);
		
		int max=avg[0], index=0;
		for(int i=0; i<avg.length;i++)
			{
				if(avg[i]>max)
					{
						max=avg[i];
						index=i;
					}
			}
		if(p1d1.pliid==(index+1))
		System.out.println(p1d1.pro_facility_name+" has highest production");
		else if(p2d1.pliid==(index+1))
			System.out.println(p2d1.pro_facility_name+" has highest production");
		else if(p3d1.pliid==(index+1))
			System.out.println(p3d1.pro_facility_name+" has highest production");
		else if(p4d1.pliid==(index+1))
			System.out.println(p4d1.pro_facility_name+" has highest production");
		else if(p5d1.pliid==(index+1))
			System.out.println(p5d1.pro_facility_name+" has highest production");
		
		
		System.out.println();
		sortingBasedonNames(l1);
		System.out.println();
		maxProductionDetails(l1);
		System.out.println();
		sortingBasedOnDate(l1);
	}
	
	
	

	public static void sortingBasedonNames(ArrayList<ProductionFacility> l1)
	{
		System.out.println("Details of facility based on names: ");
		
		Collections.sort(l1, new Comparator<ProductionFacility>() {
			public int compare(ProductionFacility o1, ProductionFacility o2) 
			{
				return o1.getPro_facility_name().compareTo(o2.getPro_facility_name());
			}
			
		});
		
		for(ProductionFacility x: l1)
			{
				System.out.println(x);
			}
		
	}
	
	public static void maxProductionDetails(ArrayList<ProductionFacility> l1)
		{
			System.out.println("Facility having highest production: ");
			Collections.sort(l1, new Comparator<ProductionFacility>() {
				public int compare(ProductionFacility o1, ProductionFacility o2)
					{
						Integer i1= (Integer) o1.totalproduction_perday;
						Integer i2= (Integer) o2.totalproduction_perday;
						return i2.compareTo(i1);
					}
			});
			
			System.out.println(l1.get(0));
		}
	
	private static void sortingBasedOnDate(ArrayList<ProductionFacility> l1)
		{
			System.out.println("Facility details based on production date: ");
			
			Collections.sort(l1, new Comparator<ProductionFacility>(){
				public int compare(ProductionFacility o1,ProductionFacility o2)
				{
					LocalDate d1=(LocalDate) o1.prod_date;
					LocalDate d2=(LocalDate) o2.prod_date;
					
					return d1.compareTo(d2);
				}
			});
			for(ProductionFacility x: l1) 
			{
				System.out.println(x);
			}
		}
	
	
}

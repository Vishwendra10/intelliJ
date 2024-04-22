package com.training.oopsassg08;

/*Demonstrating Inheritance*/
public class Mobile extends Electronics {

	public Mobile(int id, String semiconductorType, String dateOfManufacturing) {
		super(id, semiconductorType, dateOfManufacturing);
		System.out.println("Instantiating Electronics class Via Mobile class");
		// TODO Auto-generated constructor stub
	}
	
	

}

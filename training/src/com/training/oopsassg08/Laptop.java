package com.training.oopsassg08;

/*Demonstrating Inheritance*/
public class Laptop extends Electronics {

	public Laptop(int id, String semiconductorType, String dateOfManufacturing) {
		super(id, semiconductorType, dateOfManufacturing);
		System.out.println("Instantiating Electronics class Via Laptop class");
		// TODO Auto-generated constructor stub
	}

}

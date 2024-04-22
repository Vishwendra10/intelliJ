package com.training.oopsassg08;

/*Demonstrating Inheritance*/
public class Lcd extends Electronics {

	public Lcd(int id, String semiconductorType, String dateOfManufacturing) {
		super(id, semiconductorType, dateOfManufacturing);
		System.out.println("Instantiating Electronics class Via Lcd class");
		// TODO Auto-generated constructor stub
	}

}

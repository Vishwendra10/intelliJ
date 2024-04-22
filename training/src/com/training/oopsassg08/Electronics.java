package com.training.oopsassg08;

/*Demonstrating Inheritance*/
public class Electronics {
	
	private int id; 
	private String semiconductorType; 
	private String dateOfManufacturing;
	
	public Electronics(int id, String semiconductorType, String dateOfManufacturing) {
		super();
		this.id = id;
		this.semiconductorType = semiconductorType;
		this.dateOfManufacturing = dateOfManufacturing;
	}

	@Override
	public String toString() {
		return "Electronics [id=" + id + ", semiconductorType=" + semiconductorType + ", dateOfManufacturing="
				+ dateOfManufacturing + "]";
	}
	
	

}

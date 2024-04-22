package com.training.oopsassg1;


/*Demonstrating Association*/
public class Customer extends Person {
	
	private String dateofresignation;
	private String deliveryaddress;
	private String contactno;
	private String emailid;
	
	
	public Customer(int pid, String pname, String paddress, String dob,String dateofresignation, String deliveryaddress, String contactno, String emailid) {
		
		//Calling parameterized constructor of Person class
		super(pid, pname, paddress, dob);
		
		this.dateofresignation = dateofresignation;
		this.deliveryaddress = deliveryaddress;
		this.contactno = contactno;
		this.emailid = emailid;
	}


	public String getDateofresignation() {
		return dateofresignation;
	}


	public void setDateofresignation(String dateofresignation) {
		this.dateofresignation = dateofresignation;
	}


	public String getDeliveryaddress() {
		return deliveryaddress;
	}


	public void setDeliveryaddress(String deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}


	public String getContactno() {
		return contactno;
	}


	public void setContactno(String contactno) {
		this.contactno = contactno;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	
	
}

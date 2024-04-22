package com.training.oopsassg1;

/*Demonstrating Association*/
public class Employee extends Person{

	private String salary;
	private String dateofjoining;
	private String baselocation;
	private Department deptobj;  //Association
	private String contactno;
	private String emailid;
	
	
	
	public Employee(int pid, String pname, String paddress, String dob,String salary, String dateofjoining, String baselocation,Department deptobj, String contactno,
			String emailid) {
		
		//Calling parameterized constructor of Person class
		super(pid, pname, paddress, dob);
		
		this.salary = salary;
		this.dateofjoining = dateofjoining;
		this.baselocation = baselocation;
		this.deptobj = deptobj;
		this.contactno = contactno;
		this.emailid = emailid;
		
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getDateofjoining() {
		return dateofjoining;
	}


	public void setDateofjoining(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}


	public String getBaselocation() {
		return baselocation;
	}


	public void setBaselocation(String baselocation) {
		this.baselocation = baselocation;
	}


	public Department getDeptobj() {
		return deptobj;
	}


	public void setDeptobj(Department deptobj) {
		this.deptobj = deptobj;
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

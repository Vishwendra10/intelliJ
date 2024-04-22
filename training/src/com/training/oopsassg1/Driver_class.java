package com.training.oopsassg1;

/*Demonstrating Association*/
public class Driver_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department d1= new Department();
		Department d2= new Department();
		Department d3= new Department();
		
		//Object array for storing depart objects
		Department[] d = new Department[5];
		
		d[0] = d1;
		d[1] = d2;
		d[2] = d3;
		
		Employee e1 = new Employee(02,"Raju","Udaipur","28-09-1994","20000", "02-02-2001", "Pune", d1, "0000000000", "bcd@gmail.com");
		Employee e2 = new Employee(03,"Shyam","Udaipur","28-07-1994","30000", "02-02-2001", "Pune", d2, "0000000000", "pqr@gmail.com");
		Employee e3 = new Employee(04,"BabuRao","Udaipur","28-06-1994","40000", "02-02-2001", "Pune", d3, "0000000000", "jkl@gmail.com");
		
		//Setting the departments for respective employees
		e2.getDeptobj().setDeptid(101);
		e2.getDeptobj().setDname("HR");
		e3.getDeptobj().setDeptid(102);
		e3.getDeptobj().setDname("Tech");
		
		//Creating customer object
		Customer c1=new Customer(02,"Vikram1","Udaipur","28-09-1994","02-05-2001", "Hinjewadi", "0000000000", "bcd@gmail.com");
		Customer c2=new Customer(04,"Vikram3","Udaipur","28-06-1994","02-07-2001", "Hinjewadi", "0000000000", "jkl@gmail.com");
		
		
		displayCustomer(c2);
		displayEmployee(e2);
		
	}
		public static void displayCustomer(Customer c) {
			System.out.println("Person details from Customer Object: ");
			System.out.println("Person id= "+ c.getPid());
			System.out.println("Person name= "+ c.getPname());
			System.out.println("Person address= "+c.getPaddress());
			System.out.println("Person dob= "+c.getDob());
			System.out.println();
			System.out.println("Customer's Details: ");
			System.out.println("DOR = "+c.getDateofresignation());
			System.out.println("Delivery Address = "+c.getDeliveryaddress());
			System.out.println("Contact Number = "+c.getContactno());
			System.out.println("Email id = "+c.getEmailid());
			System.out.println("////////////////////////////////////////////////");
		}
		
		public static void displayEmployee(Employee e) {
			System.out.println("Person details form Employee Object: ");
			System.out.println("Employee id= "+ e.getPid());
			System.out.println("Employee name= "+ e.getPname());
			System.out.println("Employee address= "+e.getPaddress());
			System.out.println("Employee dob= "+e.getDob());
			System.out.println();
			System.out.println("Employee's Details: ");
			System.out.println("Salary = "+e.getSalary());
			System.out.println("DOJ = "+e.getDateofjoining());
			System.out.println("Base Location = "+e.getBaselocation());
			System.out.println("Contact no. = "+e.getContactno());
			System.out.println("Email id = "+e.getEmailid());
			System.out.println();
			//Displaying department associated with employee
			System.out.println("Employee Department details: ");
			System.out.println("Department id= "+e.getDeptobj().getDeptid());
			System.out.println("Department name= "+e.getDeptobj().getDname());
			System.out.println("////////////////////////////////////////////////");
		}
		

	

}

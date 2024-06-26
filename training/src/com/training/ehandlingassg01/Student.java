package com.training.ehandlingassg01;

import com.training.exceptions.NegativeMarksException;
import com.training.exceptions.ResultException;

public class Student {
	


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", saddress=" + saddress + ", srobj=" + srobj + "]";
	}

	int rollno;
	String sname;
	String saddress;
	StudentResult srobj;
	
	public Student(int rollno, String sname, String saddress, StudentResult srobj) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.saddress = saddress;
		this.srobj = srobj;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public StudentResult getSrobj() {
		return srobj;
	}

	public void setSrobj(StudentResult srobj) {
		this.srobj = srobj;
	}

	public void checkResult() throws Exception {
		
		// TODO Auto-generated method stub
		if(srobj.marks<0)
			{
			 throw new NegativeMarksException("Marks entered are negative");
			}
		else if(srobj.marks<40)
			{
				throw new ResultException("Student failed");
			}
		else
			{
				srobj.result="Pass";
			}
		
	}
	
}

package com.training.collectionassg.collectionassg07;

public class Student {
	
	int rollno;
	String sname;
	private String classname;
	private int totalmarks;
	
	public Student(int rollno, String sname, String classname, int totalmarks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.classname = classname;
		this.totalmarks = totalmarks;
	}
	
	
	public float calculatePercentage()
	{
		int marks=totalmarks;
		float percentage= (marks*100)/500;
		return percentage;
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
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
				+ totalmarks + "]";
	}
	
	
	
	
}

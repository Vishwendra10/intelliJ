package com.yash.tdd.intassg5;

public class Student {
	
	private int studentid;
	private String studentname;
	private String studentclass;
	public static int count=0;
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentclass=" + studentclass
				+ "]";
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentclass() {
		return studentclass;
	}
	public void setStudentclass(String studentclass) {
		this.studentclass = studentclass;
	}
	public Student(int studentid, String studentname, String studentclass) {
		super();
		count++;
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentclass = studentclass;
	}
	

}

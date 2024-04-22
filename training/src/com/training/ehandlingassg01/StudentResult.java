package com.training.ehandlingassg01;


public class StudentResult {
	
	int marks;
	String result;
	
	public StudentResult(int marks) {
		super();
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentResult [marks=" + marks + ", result=" + result + "]";
	}
}


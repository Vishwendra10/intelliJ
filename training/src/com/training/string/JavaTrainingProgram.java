package com.training.string;

import java.util.LinkedList;

import java.util.Objects;
import java.util.logging.Logger;
/* Demo for OOPS concepts */

public class JavaTrainingProgram {
	static Logger mylog = Logger.getLogger(JavaTrainingProgram.class.getName());
	
	//Data members of class
	private String marker="";
	private String board="";
	private String countoftrainer;
	private String countoftrainee;
	private String pctype="";
	private String light="";
	private String projector="";
	static int count=0;
	
	//Method for setting the 5 requirements
	JavaTrainingProgram(String marker, String board, String countoftrainer, String countoftrainee, String pctype)
		{
			
			this.marker=marker;
			this.board=board;
			this.countoftrainer=countoftrainer;
			this.countoftrainee=countoftrainee;
			this.pctype=pctype;
			this.count++;
					
		}
	public void updateObjectArray(String marker, String board, String countoftrainer, String countoftrainee, String pctype)
	{
		
		this.marker=marker;
		this.board=board;
		this.countoftrainer=countoftrainer;
		this.countoftrainee=countoftrainee;
		this.pctype=pctype;
				
	}
	
//	JavaTrainingProgram(String marker, String board, String countoftrainer, String countoftrainee, String pctype)
//	{
//		
//		this.marker=marker;
//		this.board=board;
//		this.countoftrainer=countoftrainer;
//		this.countoftrainee=countoftrainee;
//		this.pctype=pctype;
//		this.count++;
//				
//	}
	
	// Method for getting the requirements
	 LinkedList<String> gettingAllRequirements()
		{
		 	
			LinkedList<String> l1= new LinkedList<>();
			l1.add(marker);
			l1.add(board);
			l1.add(countoftrainer);
			l1.add(countoftrainee);
			l1.add(pctype);
			
			return l1;
		}

	public String getMarker() {
		return marker;
	}

	public String getBoard() {
		return board;
	}

	public String getCountoftrainer() {
		return countoftrainer;
	}

	public String getCountoftrainee() {
		return countoftrainee;
	}

	public String getPctype() {
		return pctype;
	}

	public String getLight() {
		return light;
	}

	public String getProjector() {
		return projector;
	}

	public static int getCount() {
		return count;
	}

public static void main(String[] args) 
	{
//	mylog.info("test logger");
	
	//Create
	//Creating objects of Java Training Program class.
	JavaTrainingProgram o1= new JavaTrainingProgram("Red marker", "White board", "1", "30", "Laptop");
	JavaTrainingProgram o2= new JavaTrainingProgram("Red marker", "White board", "1", "30", "Laptop");
	JavaTrainingProgram o3= new JavaTrainingProgram("Red marker", "White board", "1", "31", "Laptop");
	JavaTrainingProgram o4= new JavaTrainingProgram("Red marker", "White board", "1", "32", "Laptop");
	JavaTrainingProgram o5= new JavaTrainingProgram("Red marker", "White board", "1", "33", "Laptop");
	
	
	//Calling static data member (count) without creating object
	Object[] objarray=new Object[count];
	
	//Populating object array
	objarray[0]=o1;
	objarray[1]=o2;
	objarray[2]=o3;
	objarray[3]=o4;
	objarray[4]=o5;
	
	//Read
	System.out.println("Printing array objects after Creation of objects: ");
	for(Object x: objarray)
		{
			System.out.println(x);
		}
	
	//Updating object o1
	System.out.println();
	System.out.println("Updating object o1 with below mentioned values: ");
	System.out.println("Red marker, White board, 1, 39, Laptop");
	o1.updateObjectArray("Red marker", "White board", "1", "39", "Laptop");
	System.out.println();
	
	//Printing array objects
	System.out.println("Printing array objects after updating o1: ");
	
	for(Object x: objarray)
		{
			System.out.println(x);
		}
	
	
	//Deleting object o3
	System.out.println();
	System.out.println("We are deleting object o3: ");
	
	Object delobject=o3;
	for(int i=0; i<objarray.length;i++)
		{
			if(objarray[i]==delobject)
				{
					objarray[i]=null;
				}
		}
	
	//Printing objects
	System.out.println();
	System.out.println("Array object after deleting o3 ");
	
	for(Object x: objarray)
	{
		if(x==null){
			continue;
		}
		System.out.println(x);
	}
	
//	//Printing the class name
//	System.out.println("Class name:");
//	System.out.println(o1.getClass());
//	
//	//Override equals and hashcode method as we are dealing with objects.
//	System.out.println();
//	System.out.println("Object comparision with == operators: ");
//	System.out.println(o1==o2);
//	
//	
//	//Comparision with equals method is true.
//	System.out.println("Object comparision with equals(): ");
//	System.out.println(o1.equals(o2));
//	
//	//Getting the requirements output.
//	System.out.println();
//	System.out.println(o2.gettingAllRequirements());
//		
	}
@Override
public String toString() {
	return "JavaTrainingProgram [marker=" + marker + ", board=" + board + ", countoftrainer=" + countoftrainer
			+ ", countoftrainee=" + countoftrainee + ", pctype=" + pctype + ", light=" + light + ", projector="
			+ projector + "]";
}

}

package com.training.ehandlingassg01;
import java.util.Collection;

import com.training.exceptions.NegativeMarksException;
/**
 * @author vishwendra.singh
 */
import com.training.exceptions.ResultException;
import com.training.exceptions.ServiceException;

public class DriverClass {

	public static void main(String[] args)throws ResultException, Exception {
		// TODO Auto-generated method stub
		
		try 
		{
			StudentResult sr1= new StudentResult(-1);
			Student s1= new Student(01, "abc", "Pune", sr1);
			s1.checkResult();
			System.out.println(s1);
		}
		catch(ResultException ne)
			{
				System.out.println("Negative marks exception---");
				System.out.println("Exception :  "+ ne);
				throw ne;
			}
		catch(Exception ex) {
		
//			try {
//			throw new ServiceException("nn");
//			}catch(Exception e) {
//	}

}}}

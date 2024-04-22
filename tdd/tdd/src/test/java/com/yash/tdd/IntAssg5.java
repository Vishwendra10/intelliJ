package com.yash.tdd;
import com.yash.tdd.intassg5.DriverClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class IntAssg5 {
	
	DriverClass dc=new DriverClass();
	@Test
	void testcountNoOfStudentsReturnsNumbersOfStudentsRegistered()
	{
		assertEquals(5,DriverClass.countNoOfBooks());
	}
	

}

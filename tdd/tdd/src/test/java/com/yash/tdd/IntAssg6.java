package com.yash.tdd;
import com.yash.tdd.intassg6.DriverClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class IntAssg6 {

	DriverClass dc=new DriverClass();
	@Test
	void testcountNoOfBooksReturnsNumbersOfBooksCreated()
	{
		assertEquals(4,DriverClass.countNoOfBooks());
	}
	

}

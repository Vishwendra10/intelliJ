package com.training.tddexample;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestCalculator {
	
//	@Test
//	public void testAdditionResultInteger()
//		{
//			Calculator c= new Calculator();
//			int result= c.add(10);
//			assertEquals(result, 55);
//		}
//	@Test(expected = ArithmeticException.class) public void testDivisionWithException() {int i = 6 / 0; }
//	
//	@Test
//	public   void testArrayValues(){
//	       String[] expectedvalues =   {"Renault", "Honda", "BMW"};
//	       String[] givenvalues =   {"Renault", "Honda", "BMW"};
//	         assertArrayEquals(expectedvalues,givenvalues);
//	         }
//	
//	@Test
// 	public void timeTest()
// 	{		
// 	 assertEquals(0,MyCode.printResult());
// 	}
	
	@Test(timeout   = 5000)
 	public void testTimeoutOne() throws InterruptedException 
 	{ int i=500;
 		TimeUnit.SECONDS.sleep(5000);
 		while(i<=10000) 
 			 System.out.println(i++);
 	}
	
//	@Test
// 	public void test() {
// 		  assertTrue(false);
// 	}
}

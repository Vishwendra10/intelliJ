package com.yash.tdd1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest {
	
	Multilpy multiply= new Multilpy();
	
	@Test
	public void testMultiplyReturnIntegers()
	{
		assertEquals(+0,multiply.multiply(0, 1));
	}
	
	@Test
	public void testMultiplyReturnIntegers1()
	{
		assertEquals(10,multiply.multiply(5, 2));
	}
	
	@Test
	public void testMultiplyReturnIntegersf2()
	{
		assertEquals(-0,multiply.multiply(7, 0));
	}
	
	

}

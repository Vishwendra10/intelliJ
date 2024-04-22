package com.yash.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.yash.tdd.assg.TddAssg1to7;
public class Assg5 {
	
	TddAssg1to7 ta= new TddAssg1to7();
	
	@Test
	void testCallingSumOfDigits2ReturnsInteger()
	{
		assertEquals(16 , ta.sumOfDigits2("2+3-4/2*5"));
	}

}

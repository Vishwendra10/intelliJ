package com.yash.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.yash.tdd.assg.TddAssg1to7;

public class Assg2 {
	
	TddAssg1to7 ta= new TddAssg1to7();
	
	@Test
	void testcallfactorialreturnsinteger() {
	assertEquals(24, ta.factorial(4));
	}
	

}
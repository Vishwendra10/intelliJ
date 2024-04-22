package com.yash.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.yash.tdd.assg.TddAssg1to7;
public class Assg7 {
	
	TddAssg1to7 ta= new TddAssg1to7();
	
	@Test
	void testCallconvertBinaryReturnsString() {
	assertEquals("1011", ta.convertBinary(11));
	}

}

package com.yash.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.yash.tdd.assg.TddAssg1to7;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Assg3 {
	
//	@Mock
//	private TddAssg1to7 ta;
//	TddAssg ta= Mockito.mock(TddAssg.class);
	
	TddAssg1to7 ta1= new TddAssg1to7();
	
	@Test
	void testcallCountOfEvenOddPrintsCountOfEvenAndOdd()
	{
		assertEquals("Even count: 4 and odd count: 5", ta1.countOfEvenOdd(542587545));
	}
	

}

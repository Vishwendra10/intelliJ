package com.yash.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import com.yash.tdd.assg.TddAssg1to7;

public class Assg1 {
	
//	@Mock
//	private TddAssg ta;
//  TddAssg ta= Mockito.mock(TddAssg.class);
	
	TddAssg1to7 ta= new TddAssg1to7();
	
	@Test
	void testCallAdditionOfTenNumbersMethodReturnsSumOfTenNumbers()
	{
		//Mockito.when(ta.additionOfTenNumbers()).thenReturn(55);
		assertEquals(55, ta.additionOfTenNumbers());
	}

}

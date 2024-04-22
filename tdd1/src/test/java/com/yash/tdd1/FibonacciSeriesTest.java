package com.yash.tdd1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.yash.tdd1.test1.FibonacciSeries;

public class FibonacciSeriesTest {
	

	FibonacciSeries series=new FibonacciSeries();
		
	@Test  
    public void testSeries1(){  
        assertEquals("0 1 1",series.fibonacciSeries(3));  
    } 				//expected			//actual
	
	@Test  
    public void testSeries2(){  
        assertEquals("0 1 1 2",series.fibonacciSeries(4));  
    }
	
	@Test  
    public void testSeries3(){  
        assertEquals("0 1 1 2 3",series.fibonacciSeries(5));  
    }
	
	@Test  
    public void testSeries4(){  
        assertEquals("0 1 1 2 3 5",series.fibonacciSeries(6));  
    }
	
	@Test  
    public void testSeries5(){  
        assertEquals("0 1 1 2 3 5 7",series.fibonacciSeries(7));  
    }
	
	@Test
    public void testSeries6(){  
        assertEquals("0 1 1 2 3 5 9",series.fibonacciSeries(7));  
    }
	}


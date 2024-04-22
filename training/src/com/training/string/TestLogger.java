package com.training.string;

import java.util.logging.Logger;

public class TestLogger {
	
	static Logger mylog2 = Logger.getLogger(TestLogger.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mylog2.info("Testing");
		mylog2.info(()-> {String string1="Notfound";return string1;});

	}

}

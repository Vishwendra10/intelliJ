package com.training.ehandlingassg03;

import java.io.FileOutputStream;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (FileOutputStream fos = new FileOutputStream("test.txt"))
			{
				String msg="Test file";
				byte byteArray[]=msg.getBytes();
				fos.write(byteArray);
				System.out.println("Msg inserted into file");
			}
		catch(Exception e) 
			{
				System.out.println(e);
			}

	}

}

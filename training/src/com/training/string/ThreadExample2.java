package com.training.string;

public class ThreadExample2 extends Thread{

	public void run()
	{
		for(int i=10;i<20;i++)
		{
			System.out.println(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

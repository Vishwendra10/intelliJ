package com.training.string;

public class BB extends AA {
	public BB(){
		greeting();
		prints();
		}
		void greeting(){
		System.out.println("method from B: greeting");
		}

		static void prints(){
			System.out.println("method from B: static");
		}
}

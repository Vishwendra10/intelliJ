package com.training.jdk8assg;

import java.util.stream.IntStream;

public class Jdk8Assg01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindromeUsingIntStream(38));

	}
	
	public static boolean isPalindromeUsingIntStream(int number) {
		
		return number == IntStream.iterate(number, n -> n != 0, i -> i / 10)
                .map(n -> n % 10)
                .reduce(0, (a, b) -> a * 10 + b);
	}

}

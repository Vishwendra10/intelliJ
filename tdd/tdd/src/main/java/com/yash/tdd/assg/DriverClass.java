package com.yash.tdd.assg;
/**
 * 
 * @author vishwendra.singh
 *
 */
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TddAssg1to7 tddassg= new TddAssg1to7();
		System.out.println(tddassg.additionOfTenNumbers());  //1 to 10
		System.out.println(tddassg.factorial(4));
		System.out.println(tddassg.countOfEvenOdd(542587545));
		System.out.println(tddassg.sumOfDigits("2+3+4"));
		System.out.println(tddassg.sumOfDigits2("2+3-4/2*5"));
		System.out.println(tddassg.sumIntegerDivisibleBySeven());
		System.out.println(tddassg.convertBinary(11));

	}

}

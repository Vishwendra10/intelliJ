package com.yash.tdd.assg;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author vishwendra.singh
 *
 */
public class TddAssg1to7 {
	
/**
 * 
 * TddAssg1
 */
	public int additionOfTenNumbers() {
		int sum=0;
		for( int i=1;i<=10;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	
/**
 * 
 * TddAssg2
 */	
	public int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
	
	
/**
 * 
 * TddAssg3
 */	
	public String countOfEvenOdd(long num) {
		int evencount=0,oddcount=0;
		String result="";
		while(num>0) {
			int temp=(int) (num%10);
			if(temp%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
			num=num/10;
		}
		result+="Even count: "+evencount+" and odd count: "+oddcount;
		return result;

	}

	
/**
 * 
 * TddAssg4
 */
	public int sumOfDigits(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum=sum+Character.getNumericValue(str.charAt(i));
			}
		}
		return sum;
	}
	
	
/**
 * 
 * TddAssg5
 */	
	public int sumOfDigits2(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum=sum+Character.getNumericValue(str.charAt(i));
			}
		}
		return sum;
	}
	
	
/**
 * 
 * TddAssg6
 */	
	public int sumIntegerDivisibleBySeven() {
		int sum=0;
		for(int i=100;i<=200;i++) {
			if(i%7==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
/**
 * 
 *  TddAssg7
 */
	public String convertBinary(int num)
	{
		ArrayList<Integer> a= new ArrayList<>();
		String result="";
		while(num>0) {
			a.add(num%2);
			num=num/2;
		}
		Collections.reverse(a);
		for(Integer x:a)
		{
			result=result+x;
		}
		return result;
	}
}

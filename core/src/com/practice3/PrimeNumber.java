package com.practice3;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=2,count=0;
        for(int i=1; i<=num; i++)
        {
            if(num%i==0)
                count++;
        }
        if(count>2)
        {
            System.out.println(num+" is a Composite number");
        }
        else System.out.println(num+" is a Prime number");
    }
}

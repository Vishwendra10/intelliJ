package com.practice3;

public class NumberArmstrong {
    public static void main(String[] args) {

        int num=1634,temp=num, count=0,rem=0;
        double sum=0;
        while(temp!=0)
        {
            count++;
            temp=temp/10;
        }
        temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            sum=sum+Math.pow(Double.valueOf(rem),Double.valueOf(count));
            temp=temp/10;
        }

        if(sum==num)
        {
            System.out.println(num+" is an Armstrong number");
        }
        else System.out.println(num+" is not an Armstrong number");
    }
}

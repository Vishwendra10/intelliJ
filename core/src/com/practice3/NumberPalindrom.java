package com.practice3;

public class NumberPalindrom {

    public static void main(String[] args) {
        int num=144, temp=num, rev=0, rem=0;

        while(num!=0)
        {
           rem=num%10;
           rev=rev*10 + rem;
           num=num/10;
        }
        if(rev==temp)
        {
            System.out.println(temp+" is palindrom");
        }
        else
            System.out.println(temp+" is not palindrom");

    }
}

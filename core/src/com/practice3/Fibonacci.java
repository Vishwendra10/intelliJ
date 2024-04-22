package com.practice3;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args)
    {
        //print the fibonacci series upto n elements
        int n= 10, first=0, second=1, sum=0, i=2;
        System.out.print(first+", "+second+", ");
        while(i<n)
        {
            sum=first+second;
            first= second;
            second= sum;
            System.out.print(sum+", ");
            i++;
        }
    }
}

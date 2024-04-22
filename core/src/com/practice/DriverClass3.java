package com.practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class DriverClass3 {
    public static void main(String[] args) {

        ArrayList<Integer> list1= new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        Collections.sort(list1,new MyComparator());
    }

     static class MyComparator implements Comparator
    {
            public int compare(Object o1, Object o2)
            {
                Integer i1= (Integer) o1;
                Integer i2= (Integer) o2;
                if(i1>i2)
                {
                    return -1;
                }
                else if(i1<i2)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
        }
    }


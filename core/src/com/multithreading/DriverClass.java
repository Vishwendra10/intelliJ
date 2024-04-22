package com.multithreading;

public class DriverClass {
    public static void main(String[] args) {
        MultiThreading1 m= new MultiThreading1();
        Thread t= new Thread(m);
        t.start();
        for(int i=0;i<5;i++)
        {
            System.out.println(i+" Main");
        }

    }
}

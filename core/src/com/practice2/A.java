package com.practice2;

public class A {
    A(){
        System.out.println("Default A");
    }
    A(int a){
        this();
        System.out.println("int A");
    }
    A(String a){
        this(10);
        System.out.println("Paramtarized A");
    }
    public static void m(){
        System.out.println("Static A");
    }
    public void m1(){
        System.out.println("A");
    }
}

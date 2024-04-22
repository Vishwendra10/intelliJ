package com.practice2;

public class B extends A{
    B()
    {
        System.out.println("Default B");
    }
    B(String a)
    {
        System.out.println("Parametarized B");
    }
    public static void m(){
        System.out.println("Static B");
    }
    public void m1(){
        System.out.println("B");
    }
}

package com.practice3;

public class StringWordReverse {
    public static void main(String[] args) {
        String str="My name is Vishwendra";
        String result="";
        String[] strArr=str.split("\\s");
        for(String x:strArr)
        {
            if(x.length()>5){
                result+=reverse(x);
            }
            else {
                result += x;
            }
            result+=" ";
        }
        System.out.println(result);
    }
    public static String reverse(String str)
    {
        String result="";
        for(int i=str.length()-1; i>=0; i--)
        {
            result+=str.charAt(i);
        }
        return result;
    }
}

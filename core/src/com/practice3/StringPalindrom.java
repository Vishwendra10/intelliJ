package com.practice3;

public class StringPalindrom {
    public static void main(String[] args) {
        String str="level", rev="";
        rev=reverse(str);
        if(str.equalsIgnoreCase(rev))
        {
            System.out.println(str+" is a palindrome string");
        }
        else System.out.println(str+" is not a palindrome string");

    }
    public static String reverse(String str)
    {
        StringBuffer sb= new StringBuffer(str);
        sb.reverse();
        return sb.toString();
    }
}

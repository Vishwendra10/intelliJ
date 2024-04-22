package com.practice3;

public class StringReverse
{
    public static void main(String[] args) {
        String str= "vishwendra",rev="", rev2="";
        char[] ch=str.toCharArray();
        for(int i=ch.length-1; i>=0;i--)
        {
            rev+=ch[i];
        }
        System.out.println(rev);
        System.out.println();
        //Alternative way by calling the reverse method
        rev2=reverse(str);
        System.out.println(rev2);
    }

    public static String reverse(String str)
    {
        StringBuffer sb= new StringBuffer(str);
        sb.reverse();
        return sb.toString();
    }
}

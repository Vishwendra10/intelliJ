package com.practice3;

public class PermutationString {
    public static void main(String[] args) {
        String str="abc";
        int l=0,r=str.length()-1;
        permu(str,l,r);
    }
    public static void permu(String str, int l,int r)
    {
        if(l==r)
        {
            System.out.println(str);
            return;
        }
        for(int i=l;i<=r;i++)
        {
            str=swap(str,l,i);
            permu(str,l+1,r);
            str=swap(str, l,i);
        }
    }
    public static String swap(String str, int l, int i)
    {
        char temp=str.charAt(l);
//        str.charAt(l)=str.charAt(i);
//        str.charAt(i)=temp;
        return str;
    }
}

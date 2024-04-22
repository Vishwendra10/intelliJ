package com.practice3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class StringAnagram {
    public static void main(String[] args) {
        String strTest1="Mother In Law";
        String strTest2="Hitler Woman";

        String str1=strTest1.replaceAll("\\s","");
        String str2=strTest2.replaceAll("\\s","");

        String str1L= str1.toLowerCase();
        String str2L= str2.toLowerCase();

        char[] ch1=str1L.toCharArray();
        char[] ch2=str2L.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String result1="";
        String result2="";

        if(ch1.length!=ch2.length){
            System.out.println("Strings are not anagram");
        }
        else
        {
            for(char x:ch1)
            {
                result1+=x;
            }
            for(char x:ch2)
            {
                result2+=x;
            }

            if(result1.equalsIgnoreCase(result2))
            {
                System.out.println("Strings are anagram");
            }
            else
            {
                System.out.println("Strings are not anagram");
            }
        }
    }
}

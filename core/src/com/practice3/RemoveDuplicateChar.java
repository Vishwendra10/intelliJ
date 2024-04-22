package com.practice3;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str= "level";
        char[] ch=str.toCharArray();
        LinkedHashSet<Character> hs= new LinkedHashSet<>();
        for(Character x:ch)
        {
            hs.add(x);
        }
        System.out.println(hs);
    }
}

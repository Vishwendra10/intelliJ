package com.practice3;

import java.util.LinkedHashSet;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,4,5,1};
        LinkedHashSet<Integer> hs= new LinkedHashSet<>();
        for(Integer x: arr)
        {
            hs.add(x);
        }
        System.out.println(hs);
    }
}

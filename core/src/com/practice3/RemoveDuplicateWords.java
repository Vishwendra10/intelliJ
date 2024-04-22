package com.practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String str="My and my try and test of test";
        String[] strArr=str.split("\\s");
        List<String> strList= new ArrayList<>();
        for(String x:strArr)
        {
            strList.add(x.toLowerCase());
        }
        List<String> result= strList.stream().distinct().collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}

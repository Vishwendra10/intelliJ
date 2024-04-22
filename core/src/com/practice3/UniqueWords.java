package com.practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueWords {
    public static void main(String[] args) {
        String str="My and my try and test of test";
        String[] strArray=str.split("\\s");
        List<String> wordList= new ArrayList<>();
        for(String x: strArray)
        {
            wordList.add(x.toLowerCase());
        }
        Map<String, Long> map=wordList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach((k,v)-> {if(v==1) System.out.println(k+" : "+v);});
    }
}

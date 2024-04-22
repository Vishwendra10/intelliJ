package com.practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "yashtechnologies";
        char[] ch = str.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (Character x : ch) {
            charList.add(x);
        }
        Map<Character, Long> map = charList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((k,v)-> System.out.println(k+" : "+v));
    }
}

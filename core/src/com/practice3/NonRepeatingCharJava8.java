package com.practice3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharJava8 {
    public static void main(String[] args) {
        String str2= "Java Hungry Blog Alive is Awesome";
        String str1=str2.replaceAll(" ","");
        String str= str1.toLowerCase();
        char[] ch= str.toCharArray();
        List<Character> list= new ArrayList();
        List<Character> list2= new ArrayList<>();
        for(Character x: ch)
        {
            list.add(x);
        }

        Map<Character, Long> map1=list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map1.forEach((k,v)-> {if(v==1){
            list2.add(k);
        }});
        for(int i=0;i<list2.size();i++)
        {
            if(list2.contains(list.get(i)))
            {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}

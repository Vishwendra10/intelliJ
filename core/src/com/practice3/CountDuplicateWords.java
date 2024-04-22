package com.practice3;

import java.util.*;

public class CountDuplicateWords {
    public static void main(String[] args) {
        String str="My and my try and test of test";
        int count=0;
        String[] strArr= str.split("\\s");
        HashMap<String, Integer> strMap= new HashMap<>();
        for(String x:strArr)
        {
            if(strMap.containsKey(x.toLowerCase()))
            {
                strMap.put(x.toLowerCase(),strMap.get(x)+1);
            }
            else
            {
                strMap.put(x.toLowerCase(), 1);
            }
        }
        Set s1=strMap.entrySet();
        Iterator itr= s1.iterator();

        while(itr.hasNext())
        {
            Map.Entry m=(Map.Entry)itr.next();
            if((int)m.getValue()>1){count ++;}
        }
        System.out.println(count+" words are duplicates in the input string");
    }
}

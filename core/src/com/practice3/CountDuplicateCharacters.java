package com.practice3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountDuplicateCharacters {
    public static void main(String[] args) {
        String str = "level";
        int count = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] ch = str.toCharArray();
        for (Character x : ch) {
            if (hm.containsKey(x)) {
                hm.put(x, hm.get(x) + 1);
            } else {
                hm.put(x, 1);
            }
        }

        Set s1 = hm.entrySet();
        Iterator itr = s1.iterator();

        while (itr.hasNext()) {
            Map.Entry m = (Map.Entry) itr.next();
            if((int)m.getValue()>1)
            {
                count++;
            }
        }
        System.out.println(count+" characters are duplicate in string "+"\""+str+"\"");
    }
}

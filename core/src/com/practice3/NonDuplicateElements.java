package com.practice3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NonDuplicateElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,4,5,5,6};
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(Integer x:arr)
        {
            if(hm.containsKey(x)){hm.put(x,hm.get(x)+1);}
            else{hm.put(x,1);}
        }
//        Set s1=hm.entrySet();
//        Iterator itr= s1.iterator();
//        while(itr.hasNext())
//        {
//          Map.Entry m=(Map.Entry)itr.next();
//          if((int)m.getValue()==1){
//              System.out.print(m.getKey()+" ");
//          }
//        }

        hm.forEach((k,v)->{if(v==1){
            System.out.println(k);
        }});
    }
}

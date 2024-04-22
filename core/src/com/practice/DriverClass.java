package com.practice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DriverClass {
    public static void main(String[] args) {

        List<String> list= new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("aaaa");


        //Predicate -> test(<T>)---boolean
        //Function -> apply(<T>)---return <T>
        //Consumer ->  accept(<T>)----X
        //Supplier -> get()-------return<T>


//        Multiply m=(a,b)->a*b;
//        System.out.println(m.multi(10,20));


//

        Predicate<String> p= e->e.length()>3;
        for(String x:list)
        {
            if(p.test(x))
            {
                System.out.println(x);
            }
        }

        System.out.println();
        Function<String, String> f= e->e.concat("T");

        for(String x:list)
        {
            System.out.println(f.apply(x));
        }

        System.out.println();
        Consumer<String> c= e-> System.out.println(e+" has length: "+e.length());
        for(String x: list)
        {
            c.accept(x);
        }

        System.out.println();
        Supplier<String> s=()->{
                                    String otp ="";
                                    for(int i=0;i<6;i++)
                                    {
                                        otp=otp+(int)(Math.random()*10);
                                    }
                                    return otp;
                                };
            System.out.println(s.get());

            list.stream().forEach(e->System.out.println(e));
//        list.put(1,1);
//        list.forEach((K,V)->{System.out.println(K+" "+V);});
    }
}

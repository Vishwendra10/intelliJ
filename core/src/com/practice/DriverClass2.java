package com.practice;

import java.util.*;
import java.util.stream.Collectors;

public class DriverClass2{

    public static void main(String[] args) {

        List<String> e1City= new ArrayList<>();
        e1City.add("Pune");
        e1City.add("Mumbai");
        e1City.add("Bangalore");
        List<String> e2City= new ArrayList<>();
        e2City.add("Delhi");
        e2City.add("Noida");
        List<String> e3City= new ArrayList<>();
        e3City.add("Chennai");
        e3City.add("Pune");
        e3City.add("Bangalore");
        e3City.add("Delhi");
        e3City.add("Pune");

        Employee e1= new Employee(1,"AAA",20000L,e1City,"HR");
        Employee e2= new Employee(2,"BBB",30000L,e2City,"Accounts");
        Employee e3= new Employee(3,"CCC",40000L,e3City,"IT");
        Employee e4= new Employee(3,"CAC",40000L,e3City,"IT");
        Employee e5= new Employee(3,"DCC",40000L,e3City,"IT");

        List<Employee> list= new ArrayList<>();

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

//        List<String> result=    list.stream().flatMap(e->e.getCity().stream()).distinct().collect(Collectors.toList());
//        result.forEach(System.out::println);

//        List<List<String>> resultname= list.stream().map(e->e.getCity()).collect(Collectors.toList());
//        System.out.println(resultname);

//        List<String> resultname= list.parallelStream().map(Employee::getName).collect(Collectors.toList());
//        System.out.println(resultname);

//        Comparator<Employee> cmp= (i1,i2)-> (i1.getSalary()>i2.getSalary()) ? 1 : (i1.getSalary()<i2.getSalary()) ? -1 : (i1.getName().compareTo(i2.getName()));
//        Collections.sort(list, cmp);
//
//
//
//
//        list.forEach(System.out::println);

//        String s= new String("name");
//        System.out.println(s.concat("T"));


//        String s= "name";
//        s="surname";
//        System.out.println(s);


    }
}

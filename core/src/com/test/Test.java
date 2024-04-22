package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        EmployeeComparator e1= new EmployeeComparator(3,"aba",2000);
        EmployeeComparator e2= new EmployeeComparator(2,"aaa",3000);
        EmployeeComparator e3= new EmployeeComparator(1,"da",4000);
        EmployeeComparator e4= new EmployeeComparator(1,"da",5000);

        List<EmployeeComparator> listEmp=new ArrayList<>();
        listEmp.add(e1);
        listEmp.add(e2);
        listEmp.add(e3);
        listEmp.add(e4);
//
//
//        Comparator<EmployeeComparator> defaultCmp=(i1,i2)-> i1.geteId()>i2.geteId()?1 :
//                i1.geteId()<i2.geteId()?-1 :
//                        (
//                                i1.geteName().compareTo(i2.geteName())<0? 1 :
//                                        i1.geteName().compareTo(i2.geteName())>0?-1 :
//                                                i1.geteSalary()>i2.geteSalary()?-1 :i1.geteSalary()<i2.geteSalary()?1 : 0
//                        );
//
//        Comparator<EmployeeComparator> idComp=(i1,i2)-> i1.geteId()>i2.geteId()?-1 : i1.geteId()<i2.geteId()?1 : 0;
//        Comparator<EmployeeComparator> nameComp=(i1,i2)-> i1.geteName().compareTo(i2.geteName());
//
//        Collections.sort(list,defaultCmp);
//
//        for(EmployeeComparator x: list){
//            System.out.println(x);
//        }


        List<Integer> listInt=new ArrayList<>();
        List<String> listString=new ArrayList<>();

        listInt.add(7);
        listInt.add(4);
        listInt.add(6);
        listInt.add(1);


        listString.add("aaa");
        listString.add("kaa");
        listString.add("gia");
        listString.add("aav");
        listString.add("aea");

        //System.out.println(listInt.stream().reduce((a,b)->a+b).get());


//        List<Integer> result=listInt.stream().filter(e->e%2==0).collect(Collectors.toList());
//        result.forEach(System.out::println);

//        List<String> result= listString.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
//        result.forEach(System.out::println);

//        List<String> result= listEmp.stream().map(EmployeeComparator::geteName).collect(Collectors.toList());
//        result.forEach(System.out::println);

        List<EmployeeComparator> result=listEmp.stream().map(e->{
            if(e.geteId()==1){
                e.seteSalary(e.geteSalary()+ ((e.geteSalary()*10)/100));
            }
            return e;
        }
        ).collect(Collectors.toList());
        result.forEach(System.out::println);


    }
}

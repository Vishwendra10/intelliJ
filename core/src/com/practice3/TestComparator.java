package com.practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {

    public static void main(String[] args) {
        Employee e1= new Employee(01,"aaa",30000);
        Employee e2= new Employee(02,"bbb",40000);
        Employee e3= new Employee(03,"ccc",10000);
        Employee e4= new Employee(04,"aab",60000);
        Employee e5= new Employee(05,"baa",80000);

        ArrayList<Employee> empList= new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        Comparator<Employee> nameCmp=(i1,i2)-> (i1.geteName().compareTo(i2.geteName()));

        Collections.sort(empList,nameCmp);
        for(Employee x: empList)
        {
            System.out.println(x);
        }
    }
}

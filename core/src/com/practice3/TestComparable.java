package com.practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparable {
    public static void main(String[] args) {
        EmployeeComparable e1= new EmployeeComparable(01,"aaa",30000);
        EmployeeComparable e2= new EmployeeComparable(02,"bbb",40000);
        EmployeeComparable e3= new EmployeeComparable(03,"ccc",10000);
        EmployeeComparable e4= new EmployeeComparable(04,"aab",80000);
        EmployeeComparable e5= new EmployeeComparable(05,"baa",80000);


        ArrayList<EmployeeComparable> empList= new ArrayList<EmployeeComparable>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

      Collections.sort(empList);

        for(EmployeeComparable x: empList)
        {
            System.out.println(x);
        }
    }
}

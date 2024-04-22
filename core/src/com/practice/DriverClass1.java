package com.practice;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DriverClass1 {

    public static void main(String[] args) {

//
//        Object o= new Object();
//        StringBuffer sb= (StringBuffer) o;
//
//        System.out.println(sb.hashCode());
        Employee1 e1 = new Employee1(1, "aaa", 20000L, "HR");
        Employee1 e2 = new Employee1(2, "bbb", 50000L, "Accounts");
        Employee1 e3 = new Employee1(3, "ccc", 70000L, "Dev");
        Employee1 e4 = new Employee1(4, "ddd", 5000L, "Dev");
        Employee1 e5 = new Employee1(3, "aaA", 70000L, "Dev");

//        List<Employee1> list = new ArrayList<>();
//        list.add(e1);
//        list.add(e2);
//        list.add(e3);
//        list.add(e4);
//        list.add(e5);
//
//        Map<String, Optional<Employee1>> result=list.stream().collect(Collectors.groupingBy( Employee1::getDepartment, Collectors.maxBy(Comparator.comparing(Employee1::getSalary))));
//        result.forEach((k,v)->{System.out.println(k+"..."+v);});

//        List<Employee1>test= list.stream().sorted(Comparator.comparingDouble(Employee1::getSalary).reversed().thenComparing(Employee1::getName)).collect(Collectors.toList());
//        System.out.println(test);


//        List<String> nameList=list.stream().sorted((e1.getName().comapareTo(e2.getName())).collect(Collectors.toList());
 //       list.stream().collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.toList())).forEach((k,v)-> System.out.println(k+" : "+v));
//        long max=list.stream().max(Comparator.comparing(Employee1::getSalary)).map(Employee1::getSalary).get();
//        System.out.println(max);
//        int[] a={1,3,4,5,6,7};
//        List<String>result1=list.stream().map(e->e.getName()).filter(s-> s.startsWith("a")).collect(Collectors.toList());
//        result1.forEach(System.out::println);
//
//        List<Employee1>result=list.stream().filter(s-> s.getName().startsWith("a")).collect(Collectors.toList());
//        result.forEach(System.out::println);

//        List<Long> thirdHighest=list.stream().map(Employee1::getSalary).distinct().sorted(Comparator.reverseOrder()).limit(3).skip(2).collect(Collectors.toList());
//        thirdHighest.forEach(System.out::println);
//
//
//        Map<String, List<Employee1>> m=list.stream().collect(Collectors.groupingBy(Employee1::getDepartment));
//        m.forEach((k,v)->{System.out.println(k+" : "+v);});


//        Map<String, List<Employee>> result = list.stream().collect(Collectors.groupingBy(Employee::getName));
//        result.forEach((k,v)-> System.out.println(k+": "+v));
//         List<Employee> data= list.stream().map(e-> {if(e.getSalary()<25000){e.setSalary(e.getSalary()*2);}return e;}).collect(Collectors.toList());
//         data.forEach(System.out::println);
//
//          Map<String, Long> deptwise= list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
//          deptwise.forEach((k,v)-> System.out.println(k+": "+v));


//          Comparator<Employee> cmp= (i1,i2)-> (i1.getSalary()>i2.getSalary())?1 :(i1.getSalary()<i2.getSalary()) ?-1 : i1.getName().compareTo(i2.getName());
//          Collections.sort(list,cmp);
//
//          list.forEach(System.out::println);


//        list.forEach(System.out::println);
//        list.stream().map(e->e.getName()).forEach(System.out::println);
//        List<String> list2=list.stream().map(Employee::getName).collect(Collectors.toList());
//       List<Employee> emp=  list.stream().filter(e->e.getSalary()>50000L).collect(Collectors.toList());
//       List<Employee1> l=list.stream().filter(e->e.getName().equalsIgnoreCase("aaa")).collect(Collectors.toList());
//       l.forEach(System.out::println);
//       List<Long> l2=list.stream().filter(e->e.getName().startsWith("a")).map(Employee1::getSalary).collect(Collectors.toList());
//       l2.forEach(System.out::println);
//        Map<String, List<Employee>> m=list.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()));
//        m.forEach((k,v)->{System.out.println(k+" : "+v);});

//        Optional<Employee1> list66 = list.stream().max(Comparator.comparing(Employee1::getSalary));
//        System.out.println(list66);

//        List<Integer> list2= Arrays.asList(1,1,3,5,6,11,2,2,70);
//
//        list2.stream().map(e->e*10).forEach(System.out::println);
//         Long l=list2.stream().filter(e->e%2==0).count();
//        System.out.println(l);
//
//        Predicate<Integer> even= e -> e%2==0;
//
//
//        int evencount=0,oddcount=0;
//        for(Integer x: list2)
//        {
//            if(even.test(x))
//            {
//                evencount++;
//            }
//            else {
//                oddcount++;
//            }
//        }

//        System.out.println("Evencount: "+evencount+" Oddcount: "+oddcount);


//        list2.stream().filter(e->e%2==0).forEach(System.out::println);
//        list2.stream().filter(e->e%2!=0).map(e->e*2).forEach(System.out::println);
//        Predicate<Integer> p=e->e%2!=0;
//        for (Integer x:list2){
//            if(p.test(x)){
//                System.out.println(x*2);
//            }
//            else {
//                System.out.println(x);
//            }
//        }
//
//
//       String s = "My name is vishwendra vishwendra a is a is the my is";
//        String[] str= s.split("\\s");
//        List<String> list2= new ArrayList<>();
//        for(String element : str)
//        {
//            list2.add(element);
//        }
//
//        HashMap<String, Integer>hm= new HashMap<>();
//        for(int i=0; i<list2.size(); i++)
//        {
//            if(hm.containsKey(list2.get(i)))
//            {
//                hm.put(list2.get(i),hm.get(list2.get(i))+1);
//            }
//            else
//            {
//                hm.put(list2.get(i),1);
//            }
//        }
//        hm.forEach((K,V)->{
//            System.out.println(K+" : "+V);
//        });
//        List<String> ll = new ArrayList<>();
//        String[] s1 = s.split("\\s");
//        for (String x : s1) {
//            ll.add(x.toLowerCase());
//        }
//        Map<String, Long> result = ll.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        result.forEach((k, v) -> {
//            System.out.println(k + " : " + v);
//        });


//            Optional<Employee1> list22= list.stream().max(Comparator.comparing(Employee1::getSalary));

//        list2.stream().sorted().forEach(System.out::println);


//        Comparator<Integer> c= (i1,i2)-> (i1>i2) ? 1 : (i1<i2) ? -1 : 0;
//        Collections.sort(list2,c);
//
//        list2.forEach(System.out::println);


//        int[] a = {5,1, 3, 4, 5, 2, 1, 4, 5, 3};
////        List<Integer> l = Arrays.asList(10, 20, 30, 40, 30,40);
////        l.stream().distinct().forEach(System.out::println);
//
//        for (int i = 0; i < a.length; i++) {
//            a[a[i] % a.length] = a[a[i] % a.length] + a.length;
//        }
//
//
//        for (int k = 0; k < a.length; k++) {
//
//            if (a[k] > a.length * 2) {
//                System.out.print(k + " ");
//            }
//
//        }
//


    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);

//        Map<Boolean, List<Integer>> result=list.stream().collect(Collectors.partitioningBy(e->e%2==0));
//        System.out.println(result.get(false));

//        Map<Boolean, Integer> result= list.stream()
//                .collect(Collectors.groupingBy(x->x%2==0, Collectors.summingInt(Integer::intValue)));
//        System.out.println("Odd sum : "+result.get(false));
//        System.out.println("Even sum : "+result.get(true));

        }

    }


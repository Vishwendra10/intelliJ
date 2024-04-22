package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.tddassg.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext c= new ClassPathXmlApplicationContext("application-context.xml");
        Employee e=(Employee) c.getBean("emp");
        System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
        System.out.println(e.hashCode());
        System.out.println();
        Employee e1=(Employee) c.getBean("emp1");
        System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary());
        System.out.println(e1.hashCode());
        Employee e2=(Employee) c.getBean("emp1");
        System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary());
        System.out.println(e2.hashCode());
    }
}

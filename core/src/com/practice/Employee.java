package com.practice;

import java.util.List;

public class Employee {

    private int id;
    private String name;
    private Long salary;

    private List<String> city;

    private String dept;

    public int getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public List<String> getCity() {
        return city;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", city=" + city +
                ", dept='" + dept + '\'' +
                '}';
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    public Employee(int id, String name, Long salary, List<String> city, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;
        this.dept = dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

}

package com.practice3;

import java.util.Objects;

public class Employee {
    private int eId;
    private String eName;
    private long eSalary;

    public Employee(){}
    public Employee(int eId, String eName, long eSalary)
    {
        this.eId=eId;
        this.eName=eName;
        this.eSalary=eSalary;
    }
    public int geteId()
    {
        return this.eId;
    }
    public void seteId(int eId)
    {
        this.eId=eId;
    }
    public String geteName()
    {
        return this.eName;
    }
    public long geteSalary()
    {
        return this.eSalary;
    }
    public void seteName(String eName)
    {
        this.eName=eName;
    }
    public void seteSalary(long eSalary)
    {
        this.eSalary=eSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", eSalary=" + eSalary +
                '}';
    }
}

package com.practice3;

public class EmployeeComparable implements Comparable<EmployeeComparable> {
    private int eId;
    private String eName;
    private long eSalary;

    public EmployeeComparable(){}
    public EmployeeComparable(int eId, String eName, long eSalary)
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
        return "EmployeeComparable{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", eSalary=" + eSalary +
                '}';
    }

    @Override
    public int compareTo(EmployeeComparable e) {
        if(e.geteSalary()==eSalary)
        {
            return eName.compareTo(e.geteName());
        }
        else if(e.geteSalary()>eSalary)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}



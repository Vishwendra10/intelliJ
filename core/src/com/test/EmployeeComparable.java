package com.test;

public class EmployeeComparable implements Comparable<EmployeeComparable>{
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
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", eSalary=" + eSalary +
                '}';
    }

    @Override
    public int compareTo(EmployeeComparable o) {
        if(o.geteId()==eId){
            return eName.compareTo(o.geteName());
        }
        else if(o.geteId()<eId){
            return 1;
        }
        return -1;
    }
}

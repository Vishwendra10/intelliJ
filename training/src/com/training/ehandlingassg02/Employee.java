package com.training.ehandlingassg02;

import com.training.exceptions.EmployeeAbscondingException;
import com.training.exceptions.LeaveExceedLimitException;

public class Employee {
	int [] presentdays=presentdays=new int[30];;
	char[] pd=pd=new char[30];
	int salary;
	String name;
	
	public  Employee()
	{
		
		}
	public Employee(String name, int salary, char[] pd)
		{
			this.name=name;
			this.salary=salary;
			this.pd=pd;
		}
	
	//Method to check exceptions
	public void checkAttandance() throws Exception
		{
			int leavecount=0;
			int abscondingcount=0;
			for(int i=0;i<presentdays.length;i++)
				{
					if(presentdays[i]==1) 
						{
							if(leavecount>=2)
								{
									throw new LeaveExceedLimitException("Cannot take more than 2 leaves");
								}
							else 
								{
									leavecount++;
									abscondingcount=0;
								}
						}
					else if(presentdays[i]==3)
						{
							
							if(abscondingcount>=3)
								{
									throw new EmployeeAbscondingException("Employee has been absconded");
								}
							else
								abscondingcount++;
						}
					else
						abscondingcount=0;
				}
		}
	
	// Method to convert p,l,a,n to 0,1,2,3 respectively
	public void mapAttendance()
		{
			for(int i=0;i<pd.length;i++)
				{
					if(pd[i]=='p'||pd[i]=='P')
						{
						presentdays[i]=0;
						}
					else if(pd[i]=='l'||pd[i]=='L')
						{
							presentdays[i]=1;
						}
					else if(pd[i]=='a'||pd[i]=='A')
						{
							presentdays[i]=2;
						}
					else
						{
							presentdays[i]=3;
						}
				}
		}
	//Calculating the salary based on no. of present and leaves days
	public int calculateSalary()
		{
			int perdaysalary= this.salary/presentdays.length;
			int totalsal=0;
			for(int i=0;i<presentdays.length;i++)
				{
					if(presentdays[i]==0 || presentdays[i]==1)
						{
							totalsal+=perdaysalary;
						}
				}
			return totalsal;
		}
	

}

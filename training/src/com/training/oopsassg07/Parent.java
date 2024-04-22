package com.training.oopsassg07;

/*Performing method overriding for string comparision*/
public class Parent {
	
	public static boolean compareString(String str1, String str2)
	{
		System.out.println("Inside Parent class: ");
		if(str1.length()!=str2.length())
			{
				return false;
			}
		else
			{
				char[] ch1=str1.toCharArray();
				char[] ch2=str2.toCharArray();
				
				for(int i=0;i<str1.length();i++)
					{
						if(ch1[i]==ch2[i])
							{
								continue;	
							}
						else
							{
								return false;
							}
					}
				return true;
			}
	}

}

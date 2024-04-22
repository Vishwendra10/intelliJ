package com.training.ehandlingassg08;

import com.training.exceptions.PasswordFormatException;

public class PasswordStorage {
	String password="";
	
	public PasswordStorage(String str)
		{
			this.password=str;
		}
	
	public void checkpassword(String password) throws Exception
		{
			int capitalcount=0,smallcount=0,digitcount=0,scharcount=0;
			char[] a=password.toCharArray();
			if(a.length<8)
				{
					throw new PasswordFormatException ("Length is less than 8");
				}
			else if(a.length>14)
				{
					throw new PasswordFormatException ("Length is more than 14");
				}
			else
			{
				for(int i=0;i<a.length;i++)
					{
						if(Character.isUpperCase(a[i]))
							{
								capitalcount++;
							}
						else if(Character.isLowerCase(a[i]))
							{
								smallcount++;
							}
						else if(Character.isDigit(a[i]))
							{
								digitcount++;
							}
						else
							{
								scharcount++;
							}
					}
					if(capitalcount<2)
						{
						throw new PasswordFormatException ("Password contains less than 2 Capital Letters");
						}
					else if(smallcount<2)
						{
						throw new PasswordFormatException ("Password contains less than 2 Small Letters");
						}
					else if(digitcount<2)
						{
						throw new PasswordFormatException ("Password contains less than 2 Digits");
						}
					else if(scharcount<2)
						{
						throw new PasswordFormatException ("Password contains less than 2 Special Character");
						}
					else
						System.out.println("Strong password");
			}
		}

}

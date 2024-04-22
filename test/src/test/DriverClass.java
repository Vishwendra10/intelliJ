package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DriverClass {
	
	public static void main(String[] args) 
	{
		String A="characters";
		String B="alphabets";
		String result="";
		int[] arr1=new int[26];
		int[] arr2=new int[26];
		
		for(int i=0;i<A.length();++i)
		{
			arr1[A.charAt(i)-'a']=1;
		}
		for(int i=0;i<B.length();++i)
		{
			arr2[B.charAt(i)-'a']=1;
		}
		
		for(int i=0;i<26;++i)
		{
			if((arr1[i] ^ arr2[i]) != 0)
			{
				result+=(char)('a'+i);
			}
		}
		System.out.println((result.length()==0)?"-1":result);
		
	}
}

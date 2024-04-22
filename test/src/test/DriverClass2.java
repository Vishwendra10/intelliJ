package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DriverClass2 {

	public static void main(String[] args) {
		String x="[({[([{}])]})}";
		String result="";
		Stack<Character> stack= new Stack<>();
		for(int i=0;i<x.length();i++)
		{
			char ch=x.charAt(i);
			if(isOpening(ch))
			{
				stack.push(ch);
			}
			else if(stack.isEmpty())
			{
				System.out.println("false");
			}
			else if(!isMatching(stack.peek(),ch))
			{
				System.out.println("false");
			}
			else
			{
				stack.pop();
			}
		}
		System.out.println(stack.isEmpty());	
	}

	public static boolean isOpening(char c) {
		boolean flag = false;
		if (c == '(' || c == '{' || c == '[') {
			flag = true;
		}
		return flag;
	}

	public static boolean isMatching(char a, char b) {
		boolean flag = false;
		if ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}')) {
			flag = true;
		}
		return flag;
	}
}


package com.leetCodeQuestinos;

import java.util.Stack;

	/*
	Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
	determine if the input string is valid.

	An input string is valid if:

	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	
	Note that an empty string is also considered valid.

	 */
	
	public class ValidParantheses {
	
	public static boolean isValid(String s) 
	{	
		Stack<Character> stack = new Stack<Character>();
		char[] arr = s.toCharArray();
		
		for (Character c: arr) 
		{
			if(c == '(') 
			{
				stack.push(')');
			}
			else if(c == '[') 
			{
				stack.push(']');
			}
			else if(c == '{') 
			{
				stack.push('}');
			}
			else if ((stack.isEmpty()) || (stack.pop() != c) )
			{
				return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		
		String s = "[()]";
		System.out.println(isValid(s));

	}

}

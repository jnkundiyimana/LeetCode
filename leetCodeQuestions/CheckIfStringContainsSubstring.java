package com.leetCodeQuestinos;


	// You have 2 strings s1 and s2 
	// return true if string s1 contains substring s2, 
	// return false if not.

	
	//Returns true if and only if this string contains the specified
	//* sequence of char values.


public class CheckIfStringContainsSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="abcde  abkyuid jp";
		String s2 ="ac";

		
		boolean result = s1.toLowerCase().contains(s2);
		System.out.println(result);
	}

}

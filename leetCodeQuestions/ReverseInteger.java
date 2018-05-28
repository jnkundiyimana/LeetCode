package com.leetCodeQuestinos;

public class ReverseInteger {
	
	public static int reverse(int a) {
		
		int result = 0;
		while (a != 0) {
			result = (result * 10) + (a % 10);
			a = a/10;
		}
		return result;
	}

	public static void main(String[] args) {
	
		int a = 123;
		System.out.println(reverse(a));
		
		

	}

}

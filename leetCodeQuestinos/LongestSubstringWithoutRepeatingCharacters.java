package com.leetCodeQuestinos;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstring(String s) {
	 
		int i=0, j=0, max =0;
		Set<Character> set = new HashSet<Character>();
		
		while (j < s.length()) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				max = Math.max(max, set.size());
			}else {
				set.remove(s.charAt(i));
				i++;	
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		String str = "abcdeadfsk";
		
		System.out.println(lengthOfLongestSubstring(str));

	}

}

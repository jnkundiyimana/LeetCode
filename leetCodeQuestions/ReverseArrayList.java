package com.leetCodeQuestinos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	//Remove method returns the value of the remove element

public class ReverseArrayList {

	public static List<Integer> reverse(List<Integer> list) {

		for (int i = 0, j = list.size()-1; i < list.size();  i++) {

			list.add(i, list.remove(j));
		}
		return list;
	}

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		System.out.println(reverse(list));
	}

}

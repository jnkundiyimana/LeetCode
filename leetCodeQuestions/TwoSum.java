package com.leetCodeQuestinos;

import java.util.HashMap;

//
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//Example:

//Given nums = [2, 7, 11, 15], target = 9,
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

public class TwoSum {

	public static int[] twoSum(int[] arr, int target) {

		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(target - arr[i])) {
				result[1] = i;
				result[0] = map.get(target - arr[i]);
			} else {
				map.put(arr[i], i);
			}
		}
		return result;
	}

	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 2, 7, 11, 15 };
		printArray(twoSum(arr, 9));

	}

}

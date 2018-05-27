package com.leetCodeQuestinos;

import java.util.HashSet;

public class TargetInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		HashSet<Integer> set = new HashSet<Integer>();
		int [] arr = {1,2,3,4,5,6,7,8};
		int target = 5;
		int n = arr.length;
		
		for(int i =0; i<n; i++) {
		
			if(set.contains(arr[i])) {
				System.out.println(arr[i] +" and "+ (target - arr[i]));
				break;
			}else {
				set.add(target - arr[i]);
			}
		}
		
	}
	}


package com.leetCodeQuestinos;

public class LargestSubArray {

	public static int maxSubArray(int [] arr) {
		
		int sum = 0, max =0;
		 
		for (int i=0; i<arr.length; i++) {
			sum +=arr[i];
			if(max < sum) max = sum;
			if (sum < 0) sum = 0;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}

}

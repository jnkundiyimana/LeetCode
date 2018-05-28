package com.leetCodeQuestinos;

public class ArrayOfProductsOfTheArray {

	public static void main(String[] args) {
				
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		int p =1;
		int [] newArr = new int [n];
		
		for(int i=0; i<n; i++) {
		p *= arr[i];		
		}
		
		for(int j=0; j<n; j++) {
			newArr[j] = p/arr[j];
			System.out.print( newArr[j]+", ");
		}
		

	}

}

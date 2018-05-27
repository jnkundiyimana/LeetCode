package algos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class DuplicateElemenetsArray {

	public static void main(String[] args) {
//		int[] arr = { 10, 9, 1, 3, 5, 2, 1, 4, 6, 7, 2, 3, 4 };
		String [] arr = { "my", "name", "is", "jean", "paul", "great"};
		
		Comparator<String> comp = new Comparator <String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length() ;
			}
			
		};
		
		 Arrays.sort(arr, comp);
		 
		 for (int i=0; i<arr.length; i++ ) {
				System.out.println(arr[i]);
			}

//		Set<String> set = new HashSet<String>();
//
//		for (int i = 0; i < arr.length; i++) {
//			set.add(arr[i]);
//		}
//
//		Iterator<String> it = set.iterator();
//
//			for (int i=0; i<set.size(); i++) {
//				arr[i] = it.next();
//				System.out.println(arr[i]);
//			}
	}

	static int[] bubleSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

}

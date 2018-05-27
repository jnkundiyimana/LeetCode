package algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SplitAListInMultipleSmallLists {

	public static void main(String[] args) {
		

		List<Integer> numbers = new ArrayList<Integer>(
		        Arrays.asList(5,3,1,2,9,5,0,7,10)
		    );
		
		    List<Integer> head = numbers.subList(0, 4);
		    List<Integer> tail = numbers.subList(4, 8);
		    
		    System.out.println(head); // prints "[5, 3, 1, 2]"
		    System.out.println(tail); // prints "[9, 5, 0, 7]"
		    
		    Collections.sort(head);
		    System.out.println(numbers); // prints "[1, 2, 3, 5, 9, 5, 0, 7]"
		    tail.add(-1);
		    System.out.println(numbers); // prints "[1, 2, 3, 5, 9, 5, 0, 7, -1]"
		
		    
		    //find the middle elements in a list
		
//		for (int i = 0, j = 0; j < numbers.size(); i++, j+=2) {
//			
//			if (j == numbers.size()-1) {
//				System.out.println(i);
//				System.out.println(numbers.get(i));
//			}
//			
//		}
		
//		System.out.println(numbers.size());
	}

}

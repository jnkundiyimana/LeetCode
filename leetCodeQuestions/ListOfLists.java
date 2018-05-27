package algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfLists {	
	
   public static <T> List<List<T>> chopped(List<T> list,  int batchSize) {
       
	   List<List<T>> listOfLists = new ArrayList<List<T>>();
	   
        int n = list.size();
        for (int i = 0; i < n; i += batchSize) {
        	listOfLists.add(new ArrayList<T>(
                list.subList(i, Math.min(n, i + batchSize)))
            );
        }
        return listOfLists;
    }

   
	public static void main(String[] args) {
		
		    List<Integer> numbers = new ArrayList<Integer>(
		        Arrays.asList(5,3,1,2,9,5,0,7) );
		    
		    List<List<Integer>> parts = chopped(numbers, 2);
		    System.out.println(parts); // prints "[[5, 3, 1], [2, 9, 5], [0, 7]]"
		    
//		    parts.get(0).add(-1);
//		    System.out.println(parts); // prints "[[5, 3, 1, -1], [2, 9, 5], [0, 7]]"
//		    System.out.println(numbers); // prints "[5, 3, 1, 2, 9, 5, 0, 7]" (unmodified!)
	}

}

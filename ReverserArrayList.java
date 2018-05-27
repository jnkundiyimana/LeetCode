package algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverserArrayList {

	public static List<Integer> reverse(List<Integer> list) {

		for (int i = 0, j = list.size() - 1; i < j; i++) {

			list.add(i, list.remove(j));
			
		}
		return list;
	}

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		System.out.println(reverse(numbers));

	}

}

package algos;

public class PrintPyramidOfStars {
	
	public static void pyramidOfStars(int n) {
		
		// number of spaces
		int k = 2 * n - 2;

		// outer loop to handle number of rows
		for (int i = 0; i < n; i++) {

			// inner loop to handle number spaces
			// values changing according to requirement
			for (int j = 0; j < k; j++) {
				// printing spaces
				System.out.print(" ");
			}

			// decrementing k after each loop
			k = k - 1;

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (int j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}

			// ending line after each row
			System.out.println();
		}
	}
	
	
	
//	*
//	**
//	***
//	****
//	*****
//	******
	public static void trianlgeOfStars(int n) {
		
		for(int i = 0; i<=n; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	
//	1
//	1 2
//	1 2 3
//	1 2 3 4
//	1 2 3 4 5
//	1 2 3 4 5 6
//	1 2 3 4 5 6 7
	
	
public static void triangleOfNumbers1(int n) {
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(" "+ j);
			}
			System.out.println();
		}
	}
	
	
//	1
//	2 2
//	3 3 3
//	4 4 4 4
//	5 5 5 5 5
//	6 6 6 6 6 6
//	7 7 7 7 7 7 7
	public static void triangleOfNumber2(int n) {
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(" "+ i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =5;
		pyramidOfStars(n);

		}

	}



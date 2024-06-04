/*
 * Exercise 4.1 level 1 - "Iterative Control Structures"
 * Sequential search
 */

import java.util.Scanner; // import the Scanner class

public class IndexPosition {
	public static void main(String[] args) {

		userInput();
	}

	// userInput
	public static void userInput() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter the value in the array: \n");

		System.out.println("1rst box: ");
		int n1 = myObj.nextInt();

		System.out.println("\n2nd box");
		int n2 = myObj.nextInt();

		System.out.println("\n3rd box");
		int n3 = myObj.nextInt();

		System.out.println("\n4th box");
		int n4 = myObj.nextInt();

		System.out.println("\n5th box");
		int n5 = myObj.nextInt();

		System.out.println("\n6th box");
		int n6 = myObj.nextInt();

		System.out.println("\nGive me again one of these values");
		int value = myObj.nextInt();

		System.out.println("\nSo we have {" + n1 + "," + n2 + "," + n3 + "," + n4 + "," + n5 + "," + n6
				+ "} and the value is " + value + ".");

		myObj.close();

		int[] array = { n1, n2, n3, n4, n5, n6 };

		indexPosition(array, value);

	}

	// tab of n elements, finding value


	// FOR loop
	/* for( ; ; i++) {
	*	}
	*
	*
	*
	 /* public static void indexPosition(int[] array, int value) {
	 * int n = 6; // size of the array -> array.lenght
	 * 
	 * for (int i = 0; i < n; i++) { // for loop
	 * if (array[i] == value) {
	 * int bnber = i + 1;
	 * System.out.println("\n -------------");
	 * System.out.println("The value is found for i = " + i +
	 * " , so it's box number " + bnber + ".");
	 * System.out.println("-------------");
	 * }
	 * }
	 * }
	 * }
	 

	// while loop
	 /*
	 * int i = 0;
	 * while (i < n) {
	 * ???
	 * i++;
	 * }
	 *
	 * public static void indexPosition(int[] array, int value) {
	 * // int n = 6; // size of the array -> array.lenght
	 * int i = 0;
	 * 
	 * while (i < array.length) { // for loop
	 * if (array[i] == value) {
	 * int bnber = i + 1;
	 * System.out.println("\n -------------");
	 * System.out.println("The value is found for i = " + i +
	 * " , so it's box number " + bnber + ".");
	 * System.out.println("-------------");
	 * }
	 * 
	 * i++;
	 * }
	 * 
	 */


// do while loop
/*
 * int i = 0
 * do {
 * ???
 * i++;
 * } while (i<n);
 */

	public static void indexPosition(int[] array, int value) {
		// int n = 6; // size of the array -> array.lenght
		int i = 0;

		do {
			if (array[i] == value) {
				int bnber = i + 1;
				System.out.println("\n -------------");
				System.out.println("The value is found for i = " + i + " , so it's box number " + bnber + ".");
				System.out.println("-------------");
			}

			i++;

		} while (i < array.length);

	}
}

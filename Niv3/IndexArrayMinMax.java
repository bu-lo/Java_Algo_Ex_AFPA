/*
 * Exercise 5.4 level 1 - "Manipulation of 1D/one-dimensional arrays."
 * Find index of the min, idem for the max, creation of a new array with the two index.
 */

import java.util.Scanner; // import the Scanner class


public class IndexArrayMinMax {
    
    public static void main(String[] args) {
        userInput();
    }

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

        myObj.close();

		int[] array = { n1, n2, n3, n4, n5, n6 };

        int[] minMaxIndexes = findMinMaxIndex(array);

        System.out.println("-----------------------");
        System.out.println("Index min in arrayResult[0]: " + minMaxIndexes[0]);
        System.out.println("Index max in arrayResult[1]: " + minMaxIndexes[1]);

    }

    public static int[] findMinMaxIndex(int[] array){
        
        //Initialization, hypothesis valor min or max is the firts case in the array
        int min = array[0];
        int max = array[0];

        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0 ; i< array.length ; i++){
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }

        System.out.println("-----------------------");
        System.out.println("Min: " +min);
        System.out.println("Index min: " +indexMin);
        System.out.println("-----------------------");
        System.out.println("Max: " +max);
        System.out.println("Index max: " +indexMax);

        int[] arrayResult = new int[2];
        arrayResult[0] = indexMin;
        arrayResult[1] = indexMax;

        return arrayResult;

    
    }
}
  

/*
 * Exercise 5.3 level 1 - "Manipulation of 1D/one-dimensional arrays."
 * Sum between 2 index
 */

import java.util.Scanner; // import the Scanner class

public class IndexSum {

    public static void main(String[] args) {
        userInput();
    }

    public static void userInput() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please, enter the index i: ");
        int indexi = myObj.nextInt();
        System.out.println("Please, enter the index j: ");
        int indexj = myObj.nextInt();

        indexSum(indexi, indexj);

        myObj.close();
    }

    public static void indexSum(int indexi, int indexj) {
        int[] array = { 4, 6, 2, 2 };
        int isum = 0;

        for (int i = indexi; i < indexj; i++) {
            isum += array[i];
        }

        System.out.println("---------------------------");
        System.out.println("The sum of the elements between index i & j: " + isum + " .");

    }

}
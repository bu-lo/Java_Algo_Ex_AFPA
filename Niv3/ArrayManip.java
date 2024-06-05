/*
 * Exercise 5.7 level 1 - "Manipulation of 1D/one-dimensional arrays."
 * Manipulation of an array with integers and user Input.
 */

import java.util.Scanner; // import the Scanner class

public class ArrayManip {

    public static void main(String[] args) {
        int[] array = userInput();
        averageOfAnArray(array);
        minMaxArray(array);

    }

    public static int[] userInput() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter the numbers of values: ");
        int arraySize = myObj.nextInt();
        System.out.println("---");

        int[] arrayToProcess = new int[arraySize];

        System.out.println("We are going to put the values in an array of 1D.");
        System.out.println("---");

        for (int i = 0; i < arraySize; i++) {
            int nb = i + 1;
            System.out.println("Enter the number number: " + nb + " .");
            arrayToProcess[i] = myObj.nextInt();
        }

        myObj.close();

        return arrayToProcess;

    }

    /**
     * Average of the array
     *
     * @param array
     * @return
     */
    public static double averageOfAnArray(int[] array) {
        double som = 0;

        for (int i = 0; i < array.length; i++) {
            som += array[i];
        }

        double averageArray = som / array.length;

        System.out.println("-----------------------");
        System.out.println("The average of the array is: " + averageArray + " .");

        return averageArray;

    }

    /**
     * Min Max of the array
     *
     * @param array
     * @return
     */
    public static void minMaxArray(int[] array) {

        //Initialization, hypothesis valor min or max is the firts case in the array
        int min = array[0];
        int max = array[0];

        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < array.length; i++) {
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
        System.out.println("Min: " + min);
        System.out.println("Index min: " + indexMin);
        System.out.println("-----------------------");
        System.out.println("Max: " + max);
        System.out.println("Index max: " + indexMax);
        System.out.println("-----------------------");
    }
}

/*
* Exercise 18 level 3 - "Sorting algorithm" V2 "QUICKSORT"
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner; //import the Scanner class

public class QuickSortingAlgo {

    public static void main(String[] args) {
        int[] randomArray = generateRandomArray();
        System.out.println("The array is " + Arrays.toString(randomArray) + " for the moment.");

        int[] quickSortingArray = quickSort(randomArray, 0, randomArray.length - 1);
        System.out.println("The array is now " + Arrays.toString(quickSortingArray) + " after the Quick sorting.");
    }

    /**
     * Generate a random array thanks to userInput: size, upperBound
     * 
     * @return randomArray
     */
    public static int[] generateRandomArray() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of the array:");
        int size = sc.nextInt();

        System.out.println("Please enter the upperBound value of the array:");
        int upperBound = sc.nextInt();

        sc.close();

        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(upperBound);
        }

        return array;
    }

    /**
     * Sort the randomArray thanks to "partition" // Divide to conquer
     * 
     * @param randomArray
     * @param low
     * @param high
     * @return randomArray
     */
    public static int[] quickSort(int[] randomArray, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(randomArray, low, high);
            quickSort(randomArray, low, pivotIndex - 1); // sorting of the left sub-array
            quickSort(randomArray, pivotIndex + 1, high); // sorting of the right sub-array
        }
        return randomArray;
    }

    /**
     * Called by quickSort to move elements in the sub-arrays
     * 
     * @param randomArray
     * @param low
     * @param high
     * @return i+1
     */
    private static int partition(int[] randomArray, int low, int high) {
        int pivot = randomArray[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (randomArray[j] <= pivot) {
                i++;

                // exchange the two elements array[i] et array[j]
                int temp = randomArray[i];
                randomArray[i] = randomArray[j];
                randomArray[j] = temp;
            }
        }

        // Exchenge array[i + 1] and array[high] (or temp)
        int temp = randomArray[i + 1];
        randomArray[i + 1] = randomArray[high];
        randomArray[high] = temp;

        return i + 1;
    }
}

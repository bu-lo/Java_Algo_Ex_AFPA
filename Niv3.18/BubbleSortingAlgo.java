/*
* Exercise 18 level 3 - "Sorting algorithm" V1 "BUBBLE SORT"
* Doc : https://interstices.info/les-algorithmes-de-tri/
*/

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortingAlgo {

    public static void main(String[] args) {
        int[] randomArray = generateRandomArray();
        System.out.println("The array is " + Arrays.toString(randomArray) + " for the moment.");

        int[] bubbleSortingArray = bubbleSort(randomArray);
        System.out.println("The array is now " + Arrays.toString(bubbleSortingArray) + " after the Bubble sorting.");
    }

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

    public static int[] bubbleSort(int[] randomArray) {
        int n = randomArray.length;
        int buffer = 0;
        
        for (int i=n-1; i>=1; i--){

            for (int k=0; k<i; k++){

                if(randomArray[k]>randomArray[k+1]){  //swap if k is bigger than the next one k+1
                    buffer = randomArray[k];
                    randomArray[k] = randomArray[k+1];
                    randomArray[k+1] = buffer;
                }
            }
        }

        return randomArray;
    }

}

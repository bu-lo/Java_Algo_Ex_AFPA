/*
 * Exercise 5.8 level 1 - "Manipulation of 1D/one-dimensional arrays."
 * Invertion of values in an array
 */

import java.util.Arrays; // to use "Arrays.toString()""

public class ArrayInversion {

    public static void main(String[] args) {
        int[] array = { 54, 1, 4, 6, 8 };

        int[] newArray = invert(array);
        System.out.println("The reversed array is: " + Arrays.toString(newArray));
    }

    public static int[] invert(int[] array) {
        int[] newArray = new int[array.length]; // creation of a new tab, same length

        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
        }

        System.out.println("The first array is: " + Arrays.toString(array) + " .");

        return (newArray);
    }
}

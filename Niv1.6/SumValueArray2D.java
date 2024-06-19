/*
* Exercise 6.1 level 1 - "Manipulation of 2D/two-dimensional arrays."
* Sum valors 2D array
 */

public class SumValueArray2D {

    public static void main(String[] args) {
        int[][] array2D = {
                { 4, 6, 5 },
                { 7, 11, 34 },
                { 28, 6, 2 },
                { 1, 2, 3 },
                { 4, 3, 10 }
        };
        int height = 5;
        int width = 3;

        sumValueArray2D(array2D, width, height);

    }

    public static void sumValueArray2D(int[][] array2D, int width, int height) {
        int result = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result += array2D[i][j];
            }
        }

        System.out.println("The result/total is equal to: " + result + " .");
    }
}

/*
* Exercise 6.2 level 1 - "Manipulation of 2D/two-dimensional arrays."
* Sum valors 2D array 
 */

public class DiagonalSomArray2D {

    public static void main(String[] args) {
        int[][] array2D = {
            {4, 6, 5, 2},
            {7, 11, 34, 1},
            {28, 6, 2, 15},
            {1, 2, 3, 19},};
        int height = 4;
        int width = 4;
        int diagonalType = 2;

        diagonalSomArray2D(array2D, height, width, diagonalType);

        int n = width; //=height -> square
        int diagonalSum = 0;

        switch (diagonalType){
        case 1:  // du haut-gauche au bas-droit
            for (int i = 0; i < n; i++) {
                diagonalSum += array2D[i][i];
            }
            break;
        case 2: // du haut-droit au bas gauche
            for (int i = 0; i < n; i++) {
                diagonalSum += array2D[i][n - 1 - i];
            }
            break;
        default:
            System.out.println("diagonalType must be 1 or 2");
        }

        System.out.println("The result/total is equal to: " + diagonalSum + " .");
    }

    public static void diagonalSomArray2D(int[][] array2D, int height, int width, int diagonalType) {

    }

}

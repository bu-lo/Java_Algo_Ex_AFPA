
/**
 * Exercice 3.3 level 1 - "Alternative control structures"
 * Finding the min and the max between 3 different values
 */

import java.util.Scanner; // Import the Scanner class

public class FindMinMax {
    public static void main(String[] args) {
        System.out.println("Hello welcome !");

        userInput();
    }

    // Fonction finding the min and the max of the 3 values
    public static void findMinMax(int var1, int var2, int var3) {
        int min = var1;
        int max = var1;

        if (var2 < min) {
            min = var2;
        }
        if (var2 > max) {
            max = var2;
        }
        if (var3 < min) {
            min = var3;
        }
        if (var3 > max) {
            max = var3;
        }
        System.out.println("---------------");
        System.out.println("The 3 numbers are: 345" + var1 + " " + var2 + " " + var3 + ".");
        System.out.println("Min is:" + min);
        System.out.println("Max is:" + max);
        System.out.println("---------------");
    }

    // User input
    public static void userInput() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter number var1:");
        int var1 = myObj.nextInt();
        System.out.println("Please enter number var2:");
        int var2 = myObj.nextInt();
        System.out.println("Please enter number var3:");
        int var3 = myObj.nextInt();

        findMinMax(var1, var2, var3);

        myObj.close();

    }

}

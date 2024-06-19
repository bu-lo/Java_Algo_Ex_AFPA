
/*
 * Exercise 5.6 level 1 - "Manipulation of 1D/one-dimensional arrays."
 * The average of all the valors of the array.
 */
import java.util.Scanner; // import the Scanner class

public class AverageOfAnArray {

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

        averageOfAnArray(array);
    }

    public static void averageOfAnArray(int[] array) {
        int som = 0;

        for (int i = 0; i < array.length; i++) {
            som += array[i];
        }

        int averageArray = som / array.length;

        System.out.println("-----------------------");
        System.out.println("The average of the array is: " + averageArray + " .");

    }
}

/*
 * Exercise 3.5 level 1 - "Alternative control structures"
 * Check a bank balance
 */

import java.util.Scanner; // Import the Scanner class

public class CanIPay {
    public static void main(String[] args) {
        System.out.println("Hello welcome in our shop !");

        userInput();
    }

    // Calculate the difference
    public static void canIPay(float s, float p) {
        if (s - p >= 0) {
            s = s - p;
            System.out.println("You can pay, remaining balance: " + s + " euros.");
        } else {
            float d = p - s;
            System.out.println("You can't pay, your balance is too low..\n");
            System.out.println("you're missing " + d + " euros.");
        }

    }

    // Input bank balance & price of the object
    public static void userInput() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please, enter your actual bank balance: ");
        float s = myObj.nextFloat();
        System.out.println("Please, enter the price of your purchase: ");
        float p = myObj.nextFloat();

        canIPay(s, p);

        myObj.close();
    }

}

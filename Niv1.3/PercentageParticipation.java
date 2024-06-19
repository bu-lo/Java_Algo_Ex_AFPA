/*
 * Exercise 3.6 level 1 - "Alternative control structures"
 * Employer participation rate
 */

import java.util.Scanner; // Import the Scanner class

public class PercentageParticipation {

    static Scanner myObj = new Scanner(System.in); // we have to open the scanner before everything with "static" before

    public static void main(String[] args) {

        char r = 'Y';

        do {
            userInput();

            // Scanner myObj = new Scanner(System.in); ---- DO NOT DO
            System.out.println("Do you want to reboot? Y/N");
            r = myObj.next().charAt(0);

        } while (r == 'Y');

        System.out.println("Thanks and have a good day !");

        myObj.close(); // CLOSING AT THE END OUT OF THE LOOP
    }

    // Calculating the percentage of participation
    public static void percentageParticipation(char c, int e, int s) {
        int pRate = 0; // p
        if (c == 'Y') {
            pRate = pRate + 20;
        } else {
            pRate = pRate + 25;
        }

        if (e > 0) {
            pRate = pRate + e * 15;
        }

        if (s < 1800) {
            pRate = pRate + 10;
        }

        if (pRate > 50) {
            pRate = 50;
        }

        System.out.println("Your participation rate is " + pRate + " %.");

    }

    // User input
    public static void userInput() {

        // Scanner myObj = new Scanner(System.in); ---- DO NOT DO

        System.out.println("Welcome in the calculation software of your participation rate!");

        System.out.println("Are you single? Y/N");
        char c = myObj.next().charAt(0);
        System.out.println("How many children do you have?");
        int e = myObj.nextInt();
        System.out.println("How much do you earn per month?");
        int s = myObj.nextInt();

        percentageParticipation(c, e, s);

        // myObj.close(); ---- DO NOT DO
    }
}

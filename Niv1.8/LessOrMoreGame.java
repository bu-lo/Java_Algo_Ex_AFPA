/*
* Exercise 8 level 1 - "Less or More Game." 
* Between 1 and 100
 */

import java.util.Scanner; // import the Scanner class
import java.util.Random; // import the Random class

public class LessOrMoreGame {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Random r = new Random(); // instantiation of an object of class Random
        int rnb = r.nextInt(101); // generate a number >= 0 et < 101

        boolean gA = false;

        while (gA == false) {
            int answer = userInput();
            gA = test(rnb, answer);
        }

        System.out.println("Well done, the number was: " + rnb + " .");

        sc.close();

    }

    public static int userInput() {

        System.out.println("Which number between O and 100 ?");
        int answer = sc.nextInt();

        return answer;
    }

    public static boolean test(int rnb, int answer) {
        boolean goodAnswer = false;

        if (rnb == answer) {
            goodAnswer = true;
        } else if (rnb > answer) {
            System.out.println("It's more.. :)");
        } else {
            System.out.println("It's less.. :)");
        }

        return goodAnswer;

    }

}
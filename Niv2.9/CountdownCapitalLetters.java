/*
* Exercise 9.2 level 2 - "Manipulation of character strings."
* Countdown capital letters
 */

import java.util.Scanner; // import the Scanner class

public class CountdownCapitalLetters {

    public static void main(String[] args) {
        System.out.println("Please enter your string of characters:");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        scanner.close();
        System.out.println("Checking for Uppercase characters...");

        int count = 0;

        for (int i = 0; i < str.length(); i++) { // check of char[i] is a capital letter
            if (Character.isUpperCase(str.charAt(i))) {
                count++; // count increments if there is a vowel in char[i]
            }
        }

        // display total count of vowels in string
        System.out.println("Total nb of vowels in string is: " + count + " .");

    }

}

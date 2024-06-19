/*
* Exercise 9.6 level 2 - "Manipulation of character strings."
* Locating a substring
 */

import java.util.Scanner; // import the Scanner class

public class LocatingSubstring {

    public static void main(String[] args) {

        // Déclaration String + Substring
        System.out.println("Please enter the string:");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println("Please enter the substring:");
        String str2 = scanner.nextLine();

        scanner.close();

        // Init indexes

        int startIndex = -1;
        int endIndex = -1;

        // Traversing the string to find the substring

        for (int i = 0; i <= str.length() - str2.length(); i++) {
            boolean found = true;

            for (int j = 0; j < str2.length(); j++) {
                if (str.charAt(i + j) != str2.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                startIndex = i;
                endIndex = i + str2.length() - 1;
                break;
            }
        }

        // Print results
        System.out.println("First index : " + startIndex);
        System.out.println("Index last character : " + endIndex);
        System.out.println("---------------------");
        System.out.println("Reminder: if it's -1, -1 -> The Substring is not in the string");
    }

}

// TEST SAVING NEW COMPUTER
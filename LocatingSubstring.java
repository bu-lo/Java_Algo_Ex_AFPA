/*
* Exercise 9.6 level 2 - "Manipulation of character strings."
* Locating a substring
 */

import java.util.Scanner; // import the Scanner class

public class LocatingSubstring {

    public static void main(String [] args) {

        //Déclaration String + Substring
        System.out.println("Please enter the string:");

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println("Please enter the substring:");
        String substring = scanner.nextLine();

        scanner.close();

        //Init indexes

        int startIndex= -1;
        int endIndex = -1;


        //Traversing the string to find the substring

        



        //Print results
        System.out.println("First index" + startIndex);
        System.out.println("Index last character" + endIndex);
        System.out.println("---------------------");
        System.out.println("Reminder: if it's -1, -1 -> substring not in the string");
    }

}

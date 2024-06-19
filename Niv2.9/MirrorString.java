/*
* Exercise 9.4 level 2 - "Manipulation of character strings."
* Mirroring a string
 */

import java.util.Scanner; // import the Scanner class

public class MirrorString {

    public static void main(String[] args) {

        System.out.println("Please enter your string of characters:");

        Scanner scanner = new Scanner(System.in);
        String originalStr = scanner.nextLine();

        scanner.close();

        String reversedStr = mirrorString(originalStr);

        System.out.println(reversedStr);

    }

    public static String mirrorString(String originalStr) {

        StringBuilder r = new StringBuilder(originalStr); // creation of a StringBuilder
        r.reverse(); // reverse content
        return r.toString(); // convert to string
    }
}

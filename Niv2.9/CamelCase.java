/*
* Exercise 9.5 level 2 - "Manipulation of character strings."
* Transforming a sentence into camelCase type.
* ex: "The small cat. -> theSmallCat"
* ex2: "Bonjour, ça va ?" -> "bonjourCaVa"
 */

import java.text.Normalizer;
import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        String initString = userInput();
        String camelCasedString = camelCase(initString);

        System.out.println(camelCasedString);
    }

    public static String userInput() {

        System.out.println(
                "Please enter your string of characters:");

        Scanner scanner = new Scanner(System.in);
        String initString = scanner.nextLine();

        scanner.close();

        return initString;
    }

    public static String camelCase(String initString) {

        /*
         * 4 steps:
         * 1) Normalize the string to remove accents and special characters //DOESN'T
         * WORK
         * 2) Separate words with spaces in an array
         * 3.A) 1rst word 1rst char in lower case
         * 3.B) Other words 1rst char in UPPER case
         * 4) Reunification of elements in one String
         */

        String str2 = "";

        // 1) Normalize the string to remove accents and special characters //DOESN'T
        // WORK
        String normalized = Normalizer.normalize(initString, Normalizer.Form.NFD); // DOESN'T WORK
        normalized = normalized.replaceAll("\\p{M}+", ""); // DOESN'T WORK

        // 2) Separate words with spaces in an array
        String[] parts = normalized.split("\\s+");

        // 3.A) 1rst word 1rst char in lower case
        if (parts.length > 0) {
            str2 += parts[0].toLowerCase(); // 4) Reunification of elements in one String
        }

        // 3.B) Other words 1rst char in UPPER case
        for (int i = 1; i < parts.length; i++) {

            String first = (parts[i].substring(0, 1)).toUpperCase();
            String rest = (parts[i].substring(1).toLowerCase());

            // 4) Reunification of elements in one String
            str2 += first + rest;
        }

        return str2;
    }

}

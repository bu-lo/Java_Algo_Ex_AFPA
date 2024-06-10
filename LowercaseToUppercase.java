/*
* Exercise 9.2 level 2 - "Manipulation of character strings."
* String: lowercase to uppercase
 */

import java.util.Scanner; // import the Scanner class

public class LowercaseToUppercase {

    public static void main(String[] args) {
        System.out.println("Please enter your string of characters:");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        scanner.close();
      
        str = str.toUpperCase(); // every character -> UPPERCASE

    //display total count of vowels in string
    System.out.println ("The new string is: " +str+ " .");
    }

}


/*WRONG:
 * for (int i = 0; i < str.length(); i++) {    // check of char[i] is a capital letter
    str.charAt(i) = str.charAt(i).toUpperCase();
 }
 */

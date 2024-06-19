/*
* Exercise 10.2 level 2 - "Binary conversion."
* From Base 10 to Binary Base
 */

import java.util.Scanner; //import the Scanner class

public class Base10toBinary {

    public static void main(String[] args) {
        int n = inputUser();
        String result = base10ToBinary(n);

        System.out.println(n + " in Base 10 = " + result + " in Binary.");
    }

    public static int inputUser() {
        System.out.println("Please enter the number n in Base 10: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        return n;
    }

    public static String base10ToBinary(int n) {
        StringBuilder binary = new StringBuilder();

        // Particular case 0
        if (n == 0) {
            binary.insert(0, 0);
        }

        // Others
        while (n > 0) {
            int rest = n % 2;
            binary.insert(0, rest); // we add the rest at the beginning of the string
            n = n / 2; // entire division
        }
        return binary.toString();
    }

}

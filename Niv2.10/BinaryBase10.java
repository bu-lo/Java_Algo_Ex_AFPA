/*
* Exercise 10.1 level 2 - "Binary conversion."
* From Binary to base 10
 */

import java.util.Scanner; //import the Scanner class

public class BinaryBase10 {

    public static void main(String[] args) {
        int n = inputUser();
        int result = binaryToBase10(n);

        System.out.println(n + " in Binary Base = " + result + " in Base 10.");
    }

    public static int inputUser() {
        System.out.println("Please enter the number n in Binary Base: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        scanner.close();

        return n;
    }

    public static int binaryToBase10(int n) {

        // the length of the number
        int count = 0;
        int nCount = n;

        while (nCount != 0) {
            nCount = nCount / 10;
            count++;
        }
        System.out.println("count = " + count);

        // calcul

        int total = 0;
        int restModelo = 0;

        for (int i = 0; i < count; i++) {
            restModelo = n % 10;
            n = n / 10;
            total = total + restModelo * (int) Math.pow(2, i); // Math.pow(x,y) is a double -> (int) -> int
        }

        return total;
    }
}

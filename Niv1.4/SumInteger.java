/*
 * Exercise 4.3 level 1 - "Alternative control structures"
 * Integer sum of n elements
 */

import java.util.Scanner; // Import the Scanner class 

public class SumInteger {

    public static void main (String[] args) {
       userInput(); 
}

public static void userInput() {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Choose the valor n please");
    int n = myObj.nextInt();

    sumInteger(n);

    myObj.close();
}

public static void sumInteger(int n) {
   
    int sum = 0;

    for (int i = 0; i<=n; i++) {
        sum += i;
    }

    System.out.println("The sum of the n valors is equal to: " +sum+ " .");
}

}

// Other idea with: int[] arrayInteger = new int [n];
// Ini array values
// sum = sum + arrayInteger[i];
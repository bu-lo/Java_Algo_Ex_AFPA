/*
 * Exercise 4.5 level 1 - "Alternative control structures"
 * Factorial N
 */

import java.util.Scanner; // Import the Scanner class 

public class FactorialN {

    public static void main (String[] args) {
        userInput();
}

public static void userInput() {
    Scanner myObj = new Scanner (System.in);

    System.out.println("Choose the valor n please");
    int n = myObj.nextInt();
    System.out.println("----------------");

    factorialN(n);

    myObj.close();
}

public static void factorialN (int n) {
    int totfacn = 1;

    for (int i = 1 ; i<=n ; i++){
        totfacn = totfacn * i;
    }

    System.out.println("The factorial of "+n+ " is " + totfacn + " .");

}

}

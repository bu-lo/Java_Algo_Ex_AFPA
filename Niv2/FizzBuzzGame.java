/*
 * Exercise 4.4 level 2 - "Alternative control structures"
 * FizzBuzz Game for children in order to learn divisions.
 */

 import java.util.Scanner; // Import the Scanner class 


public class FizzBuzzGame {

    public static void main (String[] args) {
        userInput(); 
}

public static void userInput() {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Choose the valor n please");
    int n = myObj.nextInt();
    System.out.println("----------------");

    fizzBuzzGame(n);

    myObj.close();
}

public static void fizzBuzzGame (int n) {

    for (int i = 1; i<=n; i++) {
        if (i % 3 == 0) {
            System.out.println("Fizz");
        } 
        else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }
}


}



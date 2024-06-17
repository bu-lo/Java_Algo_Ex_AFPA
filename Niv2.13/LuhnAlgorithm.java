/*
* Exercise 13 level 2 - "Luhn's Algorithm"
 */

import java.util.Scanner; //import the Scanner class

public class LuhnAlgorithm {
    public static void main(String[] args) {
       String creditCardNumber = userInput();
        boolean validityCard = luhnAlgorithm(creditCardNumber);

        if (validityCard == true){
            System.out.println("The credit card " + creditCardNumber+ " is VALID.");
        } else{
            System.out.println("Sorry, the credit card " + creditCardNumber+ " is INVALID.");
        }
        
    }

    /**
     * User Input credit card number
     * @return creditCardNumber
     */

    public static String userInput() {
        System.out.println("Please enter your credit card number:");

        Scanner sc = new Scanner(System.in);
        String creditCardNumber = sc.nextLine();
        sc.close();

        return creditCardNumber;
    }

    /**
     * Luhn's Algorithm
     * @param creditCardNumber
     * @return sum = sumEven (modified) + sumOdd
     */
    public static boolean luhnAlgorithm(String creditCardNumber) {
        int length = creditCardNumber.length();
        int sumEven = 0;
        int sumOdd = 0;
        int sum = 0;

        // n right->left, x2 if "even" / if>9 -> -9 / somEven
        for (int i = length-2 ; i >= 0; i-=2){
            int number = Character.getNumericValue(creditCardNumber.charAt(i));

            number = number *2 ;

            if (number > 9){
                number = number -9;
            }

            sumEven = sumEven + number;
        }

        // n right->left, somOdd
        for (int i = length-1 ; i >= 0; i-=2){
            int number = Character.getNumericValue(creditCardNumber.charAt(i));

            sumOdd = sumOdd + number;
        }

        sum = sumEven + sumOdd;

        // if last number is 0 -> true -> VALID
        return ( sum %10 == 0);
    }
}

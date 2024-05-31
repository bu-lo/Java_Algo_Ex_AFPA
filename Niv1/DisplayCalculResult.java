/**
 * Exercice 3.2 level 1 - "Alternative control structures"
 * Calcul et condition
 */

import java.util.Scanner; // Import the Scanner class

public class DisplayCalculResult
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		// Asking user x & y
		userInput();
	}
	
    // Calculation between x and y -> 2 different consequences
    public static void displayCalculResult(int x , int y){
        System.out.println("Le nombre x vaut:" + x);
        System.out.println("Le nombre y vaut:" + y);

        if (x+y > 100){
            System.out.println("x+y > 100 so we do the sum:");
            System.out.println(x+y);
        } else {
            System.out.println("x+y > 100 so we do the multiplication:");
            System.out.println(x*y);
        }
    }

    public static void userInput(){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter number x:");
        int x = myObj.nextInt();
        System.out.println("Please enter number y:");
        int y = myObj.nextInt();
       
        displayCalculResult(x, y);

        myObj.close();
    }
}

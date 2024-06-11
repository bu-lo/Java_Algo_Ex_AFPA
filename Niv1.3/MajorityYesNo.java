/*
 * Exercice 3.1 level 1 - "Alternative control structures"
 * Verification of majority
 */

//Recover the current year
//int currentYear = Year.now().getValue();

import java.time.Year;
import java.util.Scanner;

public class MajorityYesNo
{
    
 public static void main(String[] args) {
    
    System.out.println("Welcome !");

    //ask the user's name
    fctBirthYear();

    }

// calculation of the difference between currentYear and birthYear
public static void majorityYesNo (int birthYear){

    int currentYear = Year.now().getValue(); //declaring variables
    int age = currentYear - birthYear;

    if( age > 17){
        System.out.println("-> You have the majority.");
    } else{
        System.out.println("-> You are a minor.");
    }
    }

// ask the variable birthYear to the utilisator
public static void fctBirthYear (){
    Scanner myObj = new Scanner(System.in); //allows user input

    System.out.println("Please enter your birth year:");
    int birthYear = myObj.nextInt(); 

    majorityYesNo (birthYear);

    myObj.close();
}

}






/*
 * Exercice 3.4 level 1 - "Alternative control structures"
 * Vowel or Consonant
 */


import java.util.Scanner; // Import the Scanner class

public class ConsonantOrVowel
{
	public static void main(String[] args) {
		System.out.println("Hello welcome!");
		
        userInput ();
	}


//Try to find if it's a vowel, if not it's a consonant
 public static void consonantOrVowel (char x){
    if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'y'){
       x = 'v'; 
       System.out.println("It's a vowel, fonction gives: " + "x");
    } else {
        x = 'c';
        System.out.println("It's a consonant, fonction gives: " + "c");
    }
    
}


//User input
public static void userInput (){
Scanner myObj = new Scanner(System.in);

System.out.println("Please enter a letter:");
       char x = myObj.next().charAt(0); // /!\ It's a character not a number -> "nextLine" 
       
consonantOrVowel (x);

myObj.close();

} 

}

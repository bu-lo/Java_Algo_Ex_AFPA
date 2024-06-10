/*
* Exercise 9.1 level 2 - "Manipulation of character strings."
* Countdown vowels
 */

public class CountdownVowels {

    public static void main (String[] args)
    {
        String str ="GeeksForGeeks";
        str = str.toLowerCase();  // converts all the characters in the string to lowercase
        int count = 0;

        for(int i=0; i<str.length(); i++){    // check of char[i] is a vowel
            if (str.charAt(i) == 'a'|| str.charAt(i) == 'e'
            || str.charAt(i) == 'i'|| str.charAt(i) == 'o'
            ||str.charAt(i) == 'u'){
            count++;   //count increments if there is a vowel in char[i]
            } 
        }

        //display total count of vowels in string
        System.out.println("Total nb of vowels in string is: " +count+ " .");

    }

}

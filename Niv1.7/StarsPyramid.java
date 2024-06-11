/*
* Exercise 7 level 1 - "Printing a pyramid of stars." 
 */

import java.util.Scanner; // import the Scanner class

public class StarsPyramid {

    public static void main(String[] args) {
        int stars = userInput();
        starsPyramid(stars);
    }

    public static int userInput() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("How many stars high would you like ?");
		int stars = myObj.nextInt();

        myObj.close();

        return (stars);
    }

    public static void starsPyramid(int stars) {
        int i = 1;

        while (i<=stars){
            String ligne = "";

            int j = 1;
            while (j<=i){
                ligne += "*";
                j++;
            }
        
            System.out.println(ligne); 
    
            i++;
        }
        
    }

}

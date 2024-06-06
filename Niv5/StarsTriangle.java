/*
* Exercise 7 level 1 - "Printing a triangle of stars." 
 */

import java.util.Scanner; // import the Scanner class

public class StarsTriangle {

    public static void main(String[] args) {
        int stars = userInput();
        starsTriangle(stars);
    }

    public static int userInput() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("How many stars high would you like ?");
		int stars = myObj.nextInt();

        myObj.close();

        return (stars);
    }

    public static void starsTriangle(int stars) {
        int i = 1;
        boolean up = true; // true -> up, then faulse -> down

        while (i>0){
            String ligne = "";

            int j = 1;
            while (j<=i){
                ligne += "*";
                j++;
            }
        
            System.out.println(ligne); 
    
            if (i == stars){
                up = false;
                }

            if (up == true){
                i++; 
                }

            if (up == false){
                    i--;
                }
        } 
    }
}



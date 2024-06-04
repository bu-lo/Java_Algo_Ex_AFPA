/*
 * Exercise 5.3 level 1 - "Manipulation of 1D/one-dimensional arrays."
 * Sum between 2 index
 */

import java.util.Scanner; // import the Scanner class

public class IndexSum {

public static void main (String[] args){
    userInput();
}

public static void userInput(int i, int j){

    Scanner myObj = new Scanner(System.in);

    System.out.println("Please, enter the value i: ");
        int i = myObj.nextInt();
    System.out.println("Please, enter the value j: ");
        int j = myObj.nextInt();
        
    indexSum(i,j);

    myObj.close();
}

public static void indexSum (int i, int j){
    int[] array = {4,6,2,2};
    int isum = array[i] + array[y];
    

}

}

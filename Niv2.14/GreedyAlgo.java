/*
* Exercise 18 level 2 - "Greedy Algorithm/Algorithme GLOUTON"
* Step by step, an optimum local choice, in order to obtain an optimum global result.
* ex: Giving change with the fewest pieces.
* {200, 100, 50, 20, 10, 5, 2, 1}
* ex: 4,64e -> 464 => 2*200 + 1*50 + 1*10 + 2*2
*/

//
// PB: ENTRY ex: 4.64 **************************************************************
// -> WORK WITH 4.63
//

import java.util.Scanner;

public class GreedyAlgo {

    public static void main(String[] args) {
        int[]refChangeArray = {200, 100, 50, 20, 10, 5, 2, 1};
       
        int[]iniNumberEachPieces = new int[8];
        for (int i=0; i<iniNumberEachPieces.length; i++){
            iniNumberEachPieces[i] = 0;
        }

        int sum = userInput();

        //Display Result
        System.out.println("Giving change for " + (sum/100.00) + " euros : ");
        
        int[]arrayNumberPieces = calculNumberPieces(sum, refChangeArray, iniNumberEachPieces);

        //Array refChangeArray in double
        double[] doubleRefChangeArray = new double[refChangeArray.length];
        for(int i=0; i<refChangeArray.length; i++){
            doubleRefChangeArray[i]= (double) refChangeArray[i];
        }
        
        for (int i = 0; i< refChangeArray.length; i++){
            System.out.println(arrayNumberPieces[i] + " piece(s) of " + doubleRefChangeArray[i]/100.0 + " euros.");
        }
    }

    public static int userInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the giving change value: 'sum', please.");
        double sumDouble = 100*sc.nextDouble();
        int sum = (int) sumDouble;

        System.out.println("----------------");

        sc.close();

        return sum;
    }

    public static int[] calculNumberPieces(int sum, int[]refChangeArray, int[]iniNumberEachPieces){

        for(int i=0 ; i< refChangeArray.length; i++){
            if (sum > refChangeArray[i]){
                iniNumberEachPieces[i] = sum/refChangeArray[i];
                sum = sum % refChangeArray[i];
            }
        }

        return iniNumberEachPieces;
    }

}
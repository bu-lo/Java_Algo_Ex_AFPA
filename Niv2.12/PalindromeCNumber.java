/*
* Exercise 12 level 2 - "Palindrome."
* From Binary to base 10
 */

import java.util.Scanner; //import the Scanner class

public class PalindromeCNumber {
    
    public static void main(String[] args) {
        int n = inputUser();
        int rn = reverse(n);

        test(n, rn);
    }

    // user enters the string
    public static int inputUser() {
        System.out.println("Please enter a number n you want to test.");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        return n;
    }

    // reversing the string
    public static int reverse(int n){
        
        int rn = 0;

        //copy of n
        int originalN = n;

        //reversing n
        while (n != 0){
            originalN = n % 10;
            rn = rn*10 + originalN;
            n = n/10;
        }

        return rn;
    }

    // test s = rs ?
    public static void test(int n, int rn){
        if(n == rn){
            System.out.println("It's a palindrome !");
        } else {
            System.out.println("It isn't palindrome..");
        }
    }




}

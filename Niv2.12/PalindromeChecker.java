/*
* Exercise 12 level 2 - "Palindrome."
* From Binary to base 10
 */

import java.util.Scanner; //import the Scanner class
// import java.text.Normalizer;                             //DOESN'T WORK ??

public class PalindromeChecker {

    public static void main(String[] args) {
        String sn = inputUser();
        String rs = reverse(sn);

        test(sn, rs);
    }

    // user enters the string
    public static String inputUser() {
        System.out.println("Please enter a string you want to test.");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //Normalize
        //sn = Normalizer.normalize(s, Normalizer.Form.NFD);      
        // sn = sn.replaceAll("\\p{M}+" , "");                    //DOESN'T WORK ??
       
       //Remove spaces
        String sn = s.replaceAll("\\s+" , "");

        sc.close();

        return sn;
    }

    // reversing the string
    public static String reverse(String sn){
        
        String rs = "";

        for (int i = (sn.length()-1); i>=0; i--){
            rs = rs +sn.charAt(i);
        }
        System.out.println("The reversed sentence is "+"- " +rs+" -");
        return rs;
    }

    // test s = rs ?
    public static void test(String sn, String rs){
        if(sn.toLowerCase().equals(rs.toLowerCase())){
            System.out.println("It's a palindrome !");
        } else {
            System.out.println("It isn't palindrome..");
        }
    }
    
}

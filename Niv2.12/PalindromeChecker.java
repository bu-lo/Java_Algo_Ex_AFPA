/*
* Exercise 12 level 2 - "Palindrome."
* From Binary to base 10
 */
import java.text.Normalizer;
import java.util.Scanner; //import the Scanner class
// import java.text.Normalizer;                             //DOESN'T WORK ??

public class PalindromeChecker {

    public static void main(String[] args) {
        // TODO problème avec l'encodage lorsque l'utilisateur saisit une chaîne en
        // console, réfléchir à l'encodage
        // String input = inputUser();

        System.out.println("\n---- Exercise 12 level 2 - \"Palindrome.\" ----");

        String[] testStrings = { "aa",
                "ada",
                "aga, trombe d'eau, dignitaire musulman",
                "essayasse",
                "Mon nom",
                "Esope reste ici et se repose",
                "La mariée ira mal.",
                "Léon, émir cornu, d'un roc rime Noël.",
                "Élu par cette crapule",
                "réer",
                "sémèmes",
                "taggât",
                "Vive les Regex!" };

        for (String testString : testStrings) {

            String normalized = normalize(testString);
            String reversed = reverse(normalized);

            test(normalized, reversed);
        }
    }

    // user enters the string
    public static String inputUser() {
        System.out.println("Please enter a string you want to test.");

        // TODO voir pourquoi l'encodage lorsque l'utilisateur saisit une chaîne n'est
        // pas le bon
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        return s;
    }

    public static String normalize(String toNormalize) {
        // Normalize -> transformation de la chaîne de caractères
        String sn = Normalizer.normalize(toNormalize, Normalizer.Form.NFD); // 1 - décomposition des caractères --> é va se
                                                                  // transformer en " e + ' "
        sn = sn.replaceAll("\\p{M}", "");
        // Remove spaces
        sn = sn.replaceAll("\\s", "");

        return sn;
    }

    // reversing the string
    public static String reverse(String sn) {

        String rs = "";

        for (int i = (sn.length() - 1); i >= 0; i--) {
            rs = rs + sn.charAt(i);
        }
        System.out.println("The reversed sentence is " + "- " + rs + " -");
        return rs;
    }

    // test s = rs ?
    /**
     * Compare deux string afin de savoir si elle sont égales et indique en console s'il s'agit d'un palindrome.
     * 
     * @param original La chaîne de référence
     * @param reversed La chaîne inversée
     */
    public static void test(String original, String reversed) {
        if (original.toLowerCase().equals(reversed.toLowerCase())) {
            System.out.println("It's a palindrome !");
        } else {
            System.out.println("It isn't palindrome..");
        }
    }
}

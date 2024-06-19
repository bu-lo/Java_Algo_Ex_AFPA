/*
 * Exercise 4.2 level 1 - "Alternative control structures"
 * Employer participation rate
 */

public class SuscribersInTwoYears {

    public static void main(String[] args) {
        suscribersInTwoYears();
    }

    // Calculating the suscribers of the Youtuber in 24 months
    public static void suscribersInTwoYears() {
        int subInTwoYears = 2500;
        int nbMonth = 24;
        int i = 0;

        /*
         * for (int i=0; i < nbMonth ; i++) {
         * subInTwoYears += subInTwoYears * 0.05 ;
         * }
         */
        while (i < nbMonth) {
            subInTwoYears += subInTwoYears * 0.05;
            i++;
        }
        System.out.println("Hello, if you have 2500 subscribers, and you earn + 5% per month\n");
        System.out.println("In 24 months you should have " + subInTwoYears + " subscribers.\n");
        System.out.println("So work hard, and GO FOR IT !\n");
    }
}

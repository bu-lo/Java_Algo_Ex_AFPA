/*
 * Exercise 5.1 level 1 - "Manipulation of 1D/one-dimensional arrays."
 * Factorial N
 */

 public class IterationArray{

    public static void main (String[] args){
        double[] array = {12.2, 11.3, 4.4, 2.0};
        iterationArray(array);
    }
    
        public static void iterationArray(double[] array) {
            System.out.println("Values you can find in the array:");
            for (int i = 0; i<4; i++) {
                System.out.println(array[i]);
            }
        }

}

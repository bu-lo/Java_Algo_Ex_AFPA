/*
 * Exercise 5.5 level 1 - "Manipulation of 1D/one-dimensional arrays."
 * Swap 2 valors in an array.
 * Utilization of Booleans
 */

public class ValorSwap {

    public static void main(String[] args) {
        int[] array = {4, 6, 2, 155};
        int index1 = 1;
        int index2 = 3;

        boolean result = swap(array, index1, index2);

        if (result == true) {
            System.out.println("Successful Swap :");

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");

                //Other way 
                //for (int value : array){
                //System.out.println(value +" ");
            }

        } else {
            System.out.println("Failed Swap : invalid indexes !");
    }
}

/**
 * Swap function
 * @param array
 * @param index1 index of the first value in the array
 * @param index2 index of the second value in the array
 * @return
 */
    public static boolean swap(int[] array, int index1, int index2) {
        // Verification: the indexes are successful ?
        if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            return false;
        } else {
            // Swap valors
        int temporary = array[index1];   
        array[index1] = array[index2];
        array[index2] = temporary;

        return true;
        }

    }

}

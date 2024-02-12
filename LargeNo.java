public class LargeNo {
    /**
     * The main function finds the largest element in an array and prints it.
     */
    public static void main(String[] args) {
        int[] arr = {90, 564, 52, 890, 1000};
        int max = largest(arr);
        System.out.println("Largest in given array is " + max);
    }

    /**
     * The function "largest" takes an array of integers as input and returns the largest element in
     * the array.
     * 
     * @param arr The parameter "arr" is an array of integers.
     * @return The largest element in the given array.
     */
    static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

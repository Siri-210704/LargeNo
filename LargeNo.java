public class LargeNo {
    public static void main(String[] args) {
        int[] arr = {90, 564, 52, 890, 1000};
        int max = largest(arr);
        System.out.println("Largest in given array is " + max);
    }

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

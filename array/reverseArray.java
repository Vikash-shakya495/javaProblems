import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] numArr = arrayUtility.inputArray();
        reverse(numArr);
        System.out.println("swap completed");
        arrayUtility.displayingArray(numArr);
    }

    public static void reverse(int[] arr) {
        int i = 0;  // Declare the variable 'i'
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = swap;
            i++;
        }
    }
}

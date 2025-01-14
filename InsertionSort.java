

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 1, 5, 3, 2}; // Correct array initialization
        
        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        
        // Printing the sorted array
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(arr));

        // Finding maximum element
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("The maximum value is: " + max);
    }
}

}

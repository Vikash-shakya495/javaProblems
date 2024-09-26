import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        // using 2nd array
        // int[] arr = {1, 2, 3, 4, 5};
        // int[] temp = new int[arr.length];
        // for(int i = 0; i < temp.length; i++){
        //     temp[i] = arr[temp.length -i -1];
        // }
        
        // without 2nd array
        int[] arr2 = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr2.length-1; i++){
            arr2[i] = arr2[arr2.length - 1 -i];
        }
        System.out.println(Arrays.toString(arr2));
    }

    // public static void swap(int[] arr ){
    }

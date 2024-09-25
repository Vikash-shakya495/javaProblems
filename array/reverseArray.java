import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        // using 2nd array
        int[] arr = {1, 2, 3, 4, 5};
        int[] temp = new int[arr.length];
        for(int i = 0; i < temp.length; i++){
            temp[i] = arr[temp.length -i -1];
        }
        System.out.println(Arrays.toString(temp));

        // without 2nd array
        int[] arr2 = {1, 2, 3, 4, 5};
        for(int i = 0; i <  arr2.length; i++){
            arr2[i] = arr[arr2.length-i];
        }
    }

    // public static void swap(int[] arr ){
    }

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] temp = new int[arr.length];
        for(int i = 0; i < temp.length; i++){
            temp[i] = arr[temp.length -i -1];
        }
        System.out.println(Arrays.toString(temp));
    }

    // public static void swap(int[] arr ){
    }

import java.util.Arrays;
import java.util.Scanner;

public class ascendingOrder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int[] arr =  new int[sc.nextInt()];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Now it's time to sorted this array");
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                    
            }
        }
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
}
}
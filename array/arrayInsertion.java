import java.util.Arrays;
import java.util.Scanner;

public class arrayInsertion {
    public static void main(String[] args){
        int arr[] = {4,5,6,9,80};
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter how many numbers you want to insert");
        int n = sc.nextInt();

        int[] newArr = new int[arr.length + n];
        for(int i = 0 ; i < arr.length; i++){
                newArr[i] = arr[i];
            }
        for(int i = arr.length ; i < newArr.length; i++){
                newArr[i] = sc.nextInt();
            }

        System.out.println(Arrays.toString(newArr));
    }
}

import java.util.Scanner;

public class TargetNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target number: ");
        int target = sc.nextInt();

        int[] arr = { 2, 3, 3, 6, 7, 5, 2, 4 };
        
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] + arr[i + 1]) == target) {
                System.out.println("Pair found at indices: [" + i + ", " + (i + 1) + "]");
            }
        }
    }
}

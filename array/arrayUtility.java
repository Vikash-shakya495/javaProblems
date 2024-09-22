import java.util.Scanner;

public class arrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while(i<size){
            System.out.println("Please enter element no : "+(i+1) + " ");
            nums[i] = input.nextInt();
            i++;
        }

        return nums;
    }

    public static void displayingArray(int[] numArray){
        int i = 0;
        while(i < numArray.length){
            System.out.println(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}

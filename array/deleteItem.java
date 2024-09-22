import java.util.Scanner;

public class deleteItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = arrayUtility.inputArray();


        System.out.println("Enter the index to delete the item :  ");
        int deleteIndex = sc.nextInt();

        int deletedValue = delete(numArr, deleteIndex);
        
        System.out.println("deleted Value is " + deletedValue);
    }

    public static int delete(int[] arr, int index) {
        int[] temp = new int[arr.length];
        int deleteItem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                temp[i] = arr[i];
            } else {
                deleteItem = arr[i];
            }
        }
        return deleteItem; // return the deleted item

    }
}

import java.util.Scanner;
public class deleteItemLevel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = arrayUtility.inputArray();


        System.out.println("Enter the index to delete the item :  ");
        int deleteIndex = sc.nextInt();

        int[] deletedValue = delete(numArr, deleteIndex);
    
        arrayUtility.displayingArray(deletedValue);
    }

    public static int[] delete(int[] arr, int index) {
        int occ = occurrencesNumber.noOfOccurrences(arr, index);
        if(occ == 0){
            return arr;
        }
        int newSize = arr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0; 
        while( i < arr.length ){
            if(arr[i] != index){
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }

        return newArr; // return the deleted item

    }
}


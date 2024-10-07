import java.util.Arrays;

public class sumOfTwoArray {
    public static void main(String[] args) {
        int[] arr = { 2, 35, 3, 6, 34 };
        int[] arr2 = { 23, 52, 523, 62, 5 };

        if (arr.length != arr2.length) {
            System.out.println("Arrays are not of same length");
            return;
        }

        int[] sumArray = new int[arr.length];
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = arr[i] + arr2[i];
        }

        System.out.println("Sum of 1D arrays:");
        System.out.println(Arrays.toString(sumArray));

        int[][] arr3 = { { 2, 3 }, { 4, 5 }, { 6, 7 } };
        int[][] arr4 = { { 4, 5 }, { 6, 7 }, { 8, 9 } };

        int[][] sumMatrices = new int[arr3.length][arr3[0].length];

        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                sumMatrices[row][col] = arr3[row][col] + arr4[row][col];
            }
        }

        System.out.println("Sum of 2D matrices:");
        System.out.println(Arrays.deepToString(sumMatrices));

    }
}

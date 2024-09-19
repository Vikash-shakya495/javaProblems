import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        /*
         * 
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */


        //  int[][] arr = new int [3][3];

        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };


        //  int[][] arr2 = new int [3][];
        int[][] arr2 = {
            {1,2,3},
            {4,5,},
            {6,7,8,9}
        };


        int[][] arr3 = new int[3][4];
        System.out.println(arr.length);

        Scanner in = new Scanner(System.in);

        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 2; col++){
                arr3[row][col] = in.nextInt();
            }
        }
        System.out.println(arr3);



        // Defining two 3x3 matrices
        // int[][] a = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        // int[][] b = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        
        // // Resultant matrix
        // int[][] c = new int[3][3];
        
        // // Adding corresponding elements of matrices 'a' and 'b'
        // for (int row = 0; row <= 2; row++) {
        //     for (int col = 0; col <= 2; col++) {
        //         c[row][col] = a[row][col] + b[row][col];
        //     }
        // }
        
        // // Displaying the result matrix
        // System.out.println("Result of matrix addition:");
        // for (int row = 0; row <= 2; row++) {
        //     for (int col = 0; col <= 2; col++) {
        //         System.out.print(c[row][col] + " ");
        //     }
        //     System.out.println(); // Moves to the next line after each row
        // }
    }
}

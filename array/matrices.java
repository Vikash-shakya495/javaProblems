public class matrices {
    public static void main(String[] args) {
        // Defining two 3x3 matrices
        int[][] a = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] b = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        
        // Resultant matrix
        int[][] c = new int[3][3];
        
        // Adding corresponding elements of matrices 'a' and 'b'
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                c[row][col] = a[row][col] + b[row][col];
            }
        }
        
        // Displaying the result matrix
        System.out.println("Result of matrix addition:");
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                System.out.print(c[row][col] + " ");
            }
            System.out.println(); // Moves to the next line after each row
        }
    }
}

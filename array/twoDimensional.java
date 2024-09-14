public class twoDimensional {
    public static void main(String[] args) {
        int arr[][] = {{3,1,5}, {2,9,12}, {11,5,7}};
        for(int row = 0; row <= 2; row++){
            System.out.print("[");
            for(int col = 0; col <= 2; col++){
                System.out.println(arr[row][col] + " ");
                for(int k = 0; k < 1000000; k++);
            }
            System.out.print("]");
            System.out.println();
        }
    }
}

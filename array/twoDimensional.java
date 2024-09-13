public class twoDimensional {
    public static void main(String[] args) {
        int arr[][] = {{3,1,5}, {2,9,12}, {11,5,7}};
        for(int row = 0; row <= 2; row++){
            System.out.println("[");
            for(int col = 0; col <= 2; col++){
                System.out.println(arr[row][col] + " ");
            }
            System.out.println("]");
            System.out.println();
        }
    }
}

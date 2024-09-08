public class DiamondPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++){
                if(i+j>=5){
                    System.out.print("*"+ " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int k = 2; k <= 4; k++){
            for(int space = 2; space <= k; space++){
                System.out.print(" ");
            }
            for(int l = k; l <= 4; l++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}

public class kPattern {
    public static void main(String[] args){
        for(int i = 4; i >= 1; i-- ){
            for(int j = i; j >= 1; j-- ){
                System.out.print("* ");
                }
                System.out.println();
        }
        for(int k = 2; k <= 4; k++){
            for(int l = 1; l <= k; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

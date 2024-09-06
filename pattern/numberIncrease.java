public class numberIncrease {
    public static void main(String[] args) {
        String space = " ";
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j < i; j++){
                System.out.print(space + j);
            }
            System.out.println();
            space = space + "";
        }
    }
}

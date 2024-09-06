public class pattern9 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 10; j >= 1; j--) {
                if(j==6){
                    System.out.print(" ");
                }
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

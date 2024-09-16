import java.util.Scanner;

public class powerSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int currentValue = a;
            for(int j = 0; j < n; j++){
                currentValue += (int) Math.pow(2,j) * b;
                System.out.print(currentValue + " ");
            }
            System.out.println();
        }
        sc.close();

        // 
        // 2
    }
}






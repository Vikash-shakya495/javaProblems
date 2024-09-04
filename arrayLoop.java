import java.util.Scanner;

public class arrayLoop {

    public static void main(String[] args) {
        
        int[] input;
        input = new int[5];
        int i = 0;
        while (i <= input.length) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the " + input[i] + " Number");
            int a = sc.nextInt();
            input[i] = a;
            // System.out.print("\n" + input[i]);
            i++;
        }
        System.out.print("\n" + input[0]);
        System.out.print("\n" + input[1]);
        System.out.print("\n" + input[2]);
        System.out.print("\n" + input[3]);
        System.out.print("\n" + input[4]);
        // sc.close();
    }
}

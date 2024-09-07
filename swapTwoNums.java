import java.util.Scanner;

public class swapTwoNums {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();
        System.out.println("Before swapping");
        System.out.println("Value of a = "+a + " Value of b = "+b );
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping");
        System.out.println("Value of a = "+a + " Value of b = "+b );
        input.close();
    }
}

package functions;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args){
        // int ans = sum2();
        // System.out.println(ans);

        int ans = sum3(20,40);
        System.out.println(ans);
    }
    //pass the value of numbers when you arr calling method in main();
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }


    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        return (num1 + num2);
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        System.out.println("Sum of two numbers: " + (num1 + num2));
    }
}

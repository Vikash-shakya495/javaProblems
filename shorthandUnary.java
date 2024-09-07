import java.util.Scanner;

public class shorthandUnary {
    public static void main(String[] args) {
        // int a = 5;
        // Scanner input = new Scanner(System.in);
        // int x1 = input.nextInt();
        // a = a + x1;
        // System.out.println(a);
        // int x2 = input.nextInt();  
        // a = a - x2;
        // System.out.println(a);
        // int x3 = input.nextInt();  
        // a = a * x3;
        // System.out.println(a);      
        // int x4 = input.nextInt();  
        // a = a / x4;
        // System.out.println(a);
        // int x5 = input.nextInt();  
        // a = a % x5;
        // System.out.println(a);
        
        // input.close();


        // Unary operators
        int x = 5;
        int y = -x;
        int z = -y;
        System.out.println(z);


        int a = 7;
        int b = a++;
        System.out.println(b++);
        System.out.println(b);
        int c = ++b;
        System.out.println(c);



        int l = 23;
        int m = l--;
        System.out.println(m--);
        System.out.println(l);

    }
}

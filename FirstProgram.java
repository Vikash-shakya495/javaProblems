import java.lang.*;

public class firstProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to GyanTech");

        // Given the following code:
        // int a = 300;
        // int b = a++;
        // int c = --b;
        // System.out.println(a); 300
        // System.out.println(b); 301
        // System.out.println(c); 299


        // What does the following code print?

        // int a = 16;
        // int b = 4;
        // int remainder = --a % b++;
        // System.out.println(remainder); /


        // Given the following code:

        // int c = -1;
        // System.out.println(1 - c++); // 2


        // Enter the resulting value of the variable c after executing the following code.

        // int a = 2;
        // int b = 3;
        // int c = ++a + b--;
        // System.out.println(c); // 6


        // Enter the value of result:

        // int a = 4;
        // int b = a++;  // 5
        // int c = --a + b++; // 4 + 4 = 8
        // int result = ++a - (c++ - b) + c; // 5 - (8 - 5) + 9   // in this expression c uses the value 8  then increment it by +1 , hence it become 9
        // System.out.println(result); // 5 - 3 + 9


        // Given an integer n, print the value of n after applying the following operations: increment n by 1, then decrement n by 2, then double the resulting value of n.
        // int n = 5;
        // int a = ++n;
        // int b = a-2;
        // int c = b*2;
        // System.out.println(c); // 8

        int n = 0;
        System.out.print(++n);
        System.out.print(n++);
        System.out.print(n++); // ++n n++ n++ // 0+1 1++ 2++

    }
}

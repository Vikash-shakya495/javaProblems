import java.util.Scanner;

class ArithmeticCalculator{
    int a;
    int b;
    void sum1(){
        System.out.println(a+b);
    }
    void sub2(){
        System.out.println(a-b);
    }
    void mult3(){
        System.out.println(a*b);
    }
    void div4(){
        if(b!=0){
            System.out.println(a/b);
        }
    }
}

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        ArithmeticCalculator ac = new ArithmeticCalculator();
        ac.a = c;
        ac.b = d;
        ac.sum1();
        ac.sub2();
        ac.mult3();
        ac.div4();
    }
}

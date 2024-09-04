import java.util.Scanner;

public class oddEven {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if(num%2==0){
                System.out.println(num+" is even");
            }
            else{
                System.out.println(num+" is odd");
            }
        }
    }
}

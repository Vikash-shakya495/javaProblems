import java.util.Scanner;

public class greatest2 {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the first number: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int largest = c > ( a > b ? a : b ) ? c : ((a > b) ? a : b);
            System.out.println("The largest number is : " + largest);
        }
    }
}
        
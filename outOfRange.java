import java.util.Scanner;

public class outOfRange {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            System.out.println("Enter a number between 1 and 24:");
            int number = scanner.nextInt();
            if (number >= 1 && number < 12) {
                System.out.println("Good Morning");
            } else if (number >= 12 && number < 18) {
                System.out.println("Good afternoon");
            } else if (number >= 18 && number < 24) {
                System.out.println("Good Evening");
            } else {
                System.out.println("Time is out of range");
            }
        }
    }
}


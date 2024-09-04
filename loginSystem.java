import java.util.Scanner;

public class loginSystem {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            int attempt = 3;
            int i = 1;
            while (i <= attempt) {
                System.out.println("Enter your passsword: ");
                int password = Sc.nextInt();
                if (password == 420) {
                    System.out.println("Welcome to the system");
                    break;
                } else {

                    ++i;
                }
            }
            if (i == 4) {

                System.out.println("Incorrect password you are locked out");
            }
        }
    }
}

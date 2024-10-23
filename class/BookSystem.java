import java.util.Scanner;

public class BookSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Collecting book details
        System.out.println("Enter details for Physics book:");
        Book phy = new Book(sc.nextLine(), sc.nextLine(), sc.nextDouble());
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter details for Chemistry book:");
        Book chem = new Book(sc.nextLine(), sc.nextLine(), sc.nextDouble());
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter details for Maths book:");
        Book maths = new Book(sc.nextLine(), sc.nextLine(), sc.nextDouble());

        // Displaying book details
        phy.display();
        chem.display();
        maths.display();

        // Closing the scanner
        sc.close();
    }
}
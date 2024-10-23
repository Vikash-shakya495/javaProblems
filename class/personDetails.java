import java.util.Scanner;

public class personDetails {
    public static void main(String[] args) {
        
        // modify the name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String newName = sc.nextLine();
        System.out.println("Enter age");
        double age = sc.nextInt();
        System.out.println("Enter address");
        String address = sc.nextLine();
        person personDetails = new person(newName);

        personDetails.get();
    }
}

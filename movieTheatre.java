import java.util.Scanner;

public class movieTheatre {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            int pay = 0;
            int member = 1;
            if(age < 12){
                pay=5;
            }
            else if((age>= 12)&&(age<=64)){
                pay=7;
            }
            else if(age>=65){
                pay=10;
            }
            if(member >= 1){
                pay = pay - 2;
            }
            System.out.println("The Membership Applied : " + pay);
        }
    }
}

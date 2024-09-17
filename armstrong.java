import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int arm = sc.nextInt();
        int temp = arm;
        int sum = 0;
        int digit;
        while(temp > 0){
            digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        } 
        if(sum == arm){
            System.out.println("The Number is Armstrong...");
        }
        else{
            System.out.println("The Number is Not Armstrong");
        }
        sc.close();
    }
}

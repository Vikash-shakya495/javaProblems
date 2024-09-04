import java.util.Scanner;

public class maxOfThree {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int max = 0;
            int i=1;
            for(; i<=3;){
                System.out.println("Enter the " + i +" number");
                int num1 = sc.nextInt();
                if(max<num1){
                    max = num1;
                }
                i++;
            }
            System.out.print("The maximum number is "+max);
        }
    }
}



import java.util.Scanner;

public class minAndMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total the numbers in array : ");
        int total = sc.nextInt();
        int[] numbers = new int[total];

        
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < total; i++){
            numbers[i] = sc.nextInt();
        }
        
        int max = numbers[0];
        int min = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        sc.close();
        System.out.println("the maximum number is : "+ max);
        System.out.println("the minimum number is : "+ min);
    }
}

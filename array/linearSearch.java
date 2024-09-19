import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args){
                
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many inputs you want");
        int n = sc.nextInt();
        int[] marks = new int[n];

        // user input
        System.out.println("start entering 4 numbers : ");
        for(int i = 0; i < n; i++){
            marks[i] =sc.nextInt();
        }

        System.out.println("enter number want ot check in array : ");
        int x = sc.nextInt();

        // system output
        for (int i = 0; i < marks.length; i++) {
            if(x==marks[i]){
                System.out.println("Index of " + x + " is " + i);
            }
        }


        int[] arr = new int[3];
        arr[0] = 34;
        arr[1] = 45;
        arr[2] = 67;

        // enhanced for loop
        for(int num : arr ){
            System.out.println(num + " " );
        }

        sc.close();
    }
}

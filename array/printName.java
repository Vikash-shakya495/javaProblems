import java.util.Scanner;

public class printName{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of strings in array: ");
        int size = sc.nextInt();
        String name[] = new String[size];

        System.out.println("start entering the names: ");
        for(int i = 0; i < size; i++){
            name[i] = sc.next();  
        }
        // here is the output

        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
        sc.close();
    }
}
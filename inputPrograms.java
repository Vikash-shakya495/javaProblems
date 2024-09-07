import java.util.Scanner;

public class inputPrograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your name : ");
        String name = input.nextLine();
        System.out.println("GOOD MORNING : " + name);
        System.out.print("Also type your age : ");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old");
        input.close();
    }
}
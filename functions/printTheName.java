import java.util.Scanner;

public class printTheName {
    // void is not returned anything
    public static void printName(String name){
        System.out.println(name);
        return; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        printName("Hello, " + name + " Sir");
    }
}

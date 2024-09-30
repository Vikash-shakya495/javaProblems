import java.util.Scanner;
import java.util.regex.Pattern;

public class regExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        // only give true if check a , m , or n found in this word
        System.out.println(Pattern.matches("[amn]", name));

        // it checks if a, m , or n are including in any word
        System.out.println(Pattern.matches("[amn]+", name)); // like aman name having a, m, and n also

        // it checks from a to z letter in lowercase
        System.out.println(Pattern.matches("[a-z]", name));

        // if both a to z letters and 0 to 4 numbers are including then return true
        System.out.println(Pattern.matches("[a-z]+[0-4]", name));

        // it gives not including true
        System.out.println(Pattern.matches("[^amn]+", name));

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));// true

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));// false (more than 6 char)\

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));// true

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));// false ($ is not matched)

        System.out.println("Enter your email");
        String email = sc.nextLine();
        Boolean email_validate = Pattern.matches("[a-z]+[0-9]{4}+@gmail.com", email);
        if(email_validate){
            System.out.println("valid email");
        }
        else{
            System.out.println("Not valid email");
        }
    }
}

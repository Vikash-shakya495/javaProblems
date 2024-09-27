import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int testCases = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < testCases; i++) {
            String regex = scanner.nextLine();
            
            // Validate the regex pattern
            try {
                Pattern.compile(regex);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        
        scanner.close();
    }
}

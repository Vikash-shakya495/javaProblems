import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers and operator
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        // Perform operation based on user input
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
        }

        scanner.close();
    }
}




// import java.util.Scanner;

// public class ExceptionHandlingExample {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         try {
//             // Take input from the user
//             System.out.print("Enter the numerator: ");
//             int numerator = scanner.nextInt();

//             System.out.print("Enter the denominator: ");
//             int denominator = scanner.nextInt();

//             // Perform division
//             int result = numerator / denominator;
//             System.out.println("Result: " + result);

//         } catch (ArithmeticException e) {
//             // Handle division by zero
//             System.out.println("Error: Division by zero is not allowed.");

//         } catch (java.util.InputMismatchException e) {
//             // Handle invalid input
//             System.out.println("Error: Please enter valid integers.");

//         } finally {
//             // Always executed block
//             System.out.println("Thank you for using the program.");
//             scanner.close(); // Close the scanner
//         }
//     }
// }

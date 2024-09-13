public class palindrome {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            // Print the increasing part of the pattern
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print the decreasing part of the pattern
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

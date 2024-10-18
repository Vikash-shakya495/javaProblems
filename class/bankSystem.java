public class bankSystem {
    public static void main(String[] args) {
        Bank b = new Bank();  // Create a new Bank object
        b.createAccount("Vikash", "9090909090");  // Create account
        b.deposit(100.0);  // Deposit amount
        b.withdraw(50.0);  // Withdraw amount
        b.display();  // Display account details
    }
}

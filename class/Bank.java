public class Bank {
    String acc_num = "0000";   // Default account number
    String name = "cname";     // Default customer name
    String mob = "9999999990"; // Default mobile number
    Double cur_bal = 0.0;      // Current balance

    // Constructor (optional, if you want to create an account at initialization)
    public Bank() {}

    // Create account method with correct syntax
    public void createAccount(String n, String m) {
        name = n;
        mob = m;
        // Optionally set account number, here for example as a static default
        acc_num = "1234567890";  // Set to a default or random account number
    }

    // Deposit method
    public void deposit(double bal) {
        cur_bal += bal;
        System.out.println("Deposited: " + bal);
    }

    // Withdraw method with balance check
    public void withdraw(double bal) {
        if (bal <= cur_bal) {
            cur_bal -= bal;
            System.out.println("Withdrawn: " + bal);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display method to show account details
    public void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Mobile Number: " + mob);
        System.out.println("Account Number: " + acc_num);
        System.out.println("Current Balance: " + cur_bal);
    }
}

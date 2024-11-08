public class Bank {
    String acc_num = "0000";   
    String name = "cname";     
    String mob = "9999999990";
    Double cur_bal = 0.0;    

   
    public Bank() {}

    // Create account method with correct syntax
    public void createAccount(String n, String m) {
        name = n;
        mob = m;
        acc_num = "1234567890"; 
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

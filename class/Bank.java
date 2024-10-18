public class bank {
    String acc_num = "0000";
    String name = "cname";
    String mob = "9999999990";
    Double cur_bal = 0.0;
    public create_account(String n, String m){
        name = n;
        mob = m;
    }
    public void deposit(double bal){
        cur_bal = cur_bal + bal;
    }
    public void withdraw(double bal){
        cur_bal = cur_bal - bal;
    }
    public void display(){
        System.out.println("Account Number: " + acc_num);
        System.out.println("Current Balance: " + cur_bal);
    }
}


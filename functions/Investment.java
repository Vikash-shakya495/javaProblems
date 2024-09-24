package functions;

import java.util.Scanner;

public class Investment {


    double capital, rate_of_interest, time_in_year, future_value;

    void read_data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capital: ");
        capital = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        rate_of_interest = sc.nextDouble();
        System.out.println("Enter the time in years: ");
        time_in_year = sc.nextDouble();
        sc.close();
    }
    
    void calculate_fv(){
        future_value = capital * Math.pow((1 + rate_of_interest), time_in_year);
    }
    void display(){
        System.out.println("Future Value: "+future_value);
    }

    public static void main(String[] args) {
        Investment i = new Investment();
        i.read_data();
        i.calculate_fv();
        i.display();
    }
}

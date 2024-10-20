import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;

public class CurrencyFormat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double currency = sc.nextDouble();
        
        // Format for US currency
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String usCurrency = usFormat.format(currency);
        
        // Format for Indian currency (IN)
        Locale indiaLocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String inCurrency = inFormat.format(currency);
        
        // Format for Chinese currency (China)
        NumberFormat chFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chCurrency = chFormat.format(currency);
        
        // Format for French currency (France)
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String frCurrency = frFormat.format(currency);
        
        // Output the formatted currencies
        System.out.println("US: " + usCurrency);
        System.out.println("India: " + inCurrency);
        System.out.println("China: " + chCurrency);
        System.out.println("France: " + frCurrency);
        
        sc.close();
    }
}

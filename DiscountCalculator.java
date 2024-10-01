public class DiscountCalculator {
    public static void main(String[] args) {
        double originalPrice = 100.0;
        double discountPercentage = 20.0;

        double discountAmount = originalPrice * (discountPercentage / 100);
        double finalPrice = originalPrice - discountAmount;

        System.out.println("Final price: $" + finalPrice + "\n");
    }
}


public class mathCalculation {
    public static void main(String[] args) {
        // sum of two float numbers
        float num1 = 10;
        float num2 = 20;
        System.out.println(num1 + num2);

        // perimeter of a rectangele
        int a = 20;
        int b = 30;
        System.out.println(2 * (a + b));

        // area of triangle
        int base = 10;
        int height = 20;
        System.out.println(0.5 * base * height);

        // simple interest
        int principal = 1000;
        int rate = 10;
        int time = 5;
        System.out.println((principal * rate * time) / 100);

        // compound interest
        int P = 1000;
        int R = 10;
        int T = 5;
        System.out.println(P*(1+R/100)*T);

        // convert FahrenHeit to Celsius
        int F = 100;
        System.out.println((F - 32) * 5/9);

    }
}



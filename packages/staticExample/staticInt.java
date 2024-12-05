package packages.staticExample;

// this is a demo to show initialisation of static variables
public class staticInt {
    static int a = 4;
    static int b;

    // will only run once, when the first obj is create i.e. when the class is loaded for 
    static {
        System.out.println("I am in static block");
        b  =a*5;

    }
    public static void main(String[] args) {
        staticInt obj = new staticInt();
        System.out.println(staticInt.a + " " + staticInt.b);
        staticInt.b += 3;
        staticInt obj2 = new staticInt();
        System.out.println(staticInt.a + " " + staticInt.b);
    }
}

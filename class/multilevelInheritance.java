class A {
    void show_a() {
        System.out.println("\nMethod show_a called");
    }
}

class B extends A {
    void show_b() {
        System.out.println("\nMethod show_b called");
    }
}

class C extends B {
    void show_c() {
        System.out.println("\nMethod show_c called");
    }
}

public class Multilevel1 {
    public static void main(String[] args) {
        // Create an object of class C
        C c1 = new C();

        // Call methods of class A, B, and C using the C object
        c1.show_a();  // From class A
        c1.show_b();  // From class B
        c1.show_c();  // From class C
    }
}

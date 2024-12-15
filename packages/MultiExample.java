package packages; // Ensure this matches your directory structure.

class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread A: " + i);
        }
    }
}

class B extends Thread {
    public void yield() {
        for (int j = 0; j < 10; j++) {
            System.out.println("Thread B: " + j);
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 0; k < 10; k++) {
            System.out.println("Thread C: " + k);
        }
    }
}

public class MultiExample {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}

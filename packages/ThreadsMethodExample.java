package packages;

class D extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread D: " + i);
            if (i == 1) {
                System.out.println("Thread D stopping...");
                return; // Safely exit the thread.
            }
        }
        System.out.println("Out from Thread D");
    }
}

class E extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread E: " + i);
            try {
                Thread.sleep(500); // Pause the thread for 500 milliseconds.
            } catch (InterruptedException e) {
                System.out.println("Thread E interrupted");
            }
        }
        System.out.println("Out from Thread E");
    }
}

class F extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread F: " + i);
            if (i == 3) {
                System.out.println("Thread F yielding...");
                Thread.yield(); // Yield the CPU to allow other threads to execute.
            }
        }
        System.out.println("Out from Thread F");
    }
}

public class ThreadMethodsExample {
    public static void main(String[] args) {
        D threadD = new D();
        E threadE = new E();
        F threadF = new F();

        threadD.start();
        threadE.start();
        threadF.start();
    }
}

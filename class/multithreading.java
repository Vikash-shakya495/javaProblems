
public class demo implements Runnable {

    public void run() {
        try {
            System.out.println("Threads " + Thread.currentThread().getId() + " is running ");
        } catch (Exception e) {
            System.out.println("Caught the exception : " + e);
        }
    }

}
public class multithreading {
    public static void main(String[] args) {
        demo thread = new demo();
        thread.run();
    }
}

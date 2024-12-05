package packages.access;
// package packages.b;

// import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Vikash");
        // 1. access the data members
        // 2. modify the data members

        // ArrayList<Integer> list= new ArrayList<>();
        obj.getNum();
    }
}
public class greet extends Message {
    public void display() {
        message();
    }
}

abstract class A{
    abstract void display_size(); // abstract method does not have body, hence it only declared in parent class
}
class B extends A{
    void display_size(){
        System.out.println("Size of B is 10");
        }
}
public class abstract1{
    public static void main(String[] args) {
        // B n = new A();
        new B().display_size();
    }
}

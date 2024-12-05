package packages.abstract;

public abstract class Parent {
    int age;
    public Parent(int age) {
        this.age = age
    }
    static void hello(){
        System.out.println("Hey");
    }
    void normal(){
        System.out.println("This is a normal method");
    }
    abstract void career();
    abstract void partner();
}

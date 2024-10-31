class parent{
    int age = 54;
    void show(){
        System.out.println("Parent class method");
    }
}
interface wife {
    static String mywife = "vidhi";
}
class child extends parent implements wife {
    void show(){
        super.show();
        System.out.println("parent age is "+ this.age);
        System.out.println("Child clas method");
        System.out.println("My wife name is " + this.mywife);
    }
}
public class Parent {
    public static void main(String[] args){
        parent c = new child();
        c.show();
    }
}

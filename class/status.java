class parent{
    void display(){
        System.out.println("i am in parent class");
    }
}
class child extends parent{
    // @Override // here override cannot be work because in above parent there is static method , means static method cannot be overridden

    // here you can inherit but cannot override
    void display(){
        System.out.println("i am in child class");
    }
}

public class status {
    public static void main(String[] args) {
        child c = new child();
        c.display();
        }
}

// overridden depends on object, static doesnt depend on object hence static cannot be overridden, in order to override the value you need to deal with object

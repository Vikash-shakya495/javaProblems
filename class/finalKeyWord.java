class FinalExample {

    final int MAX_VALUE = 100;

    final void display() {
        System.out.println("This is a final method.");
    }
}

class SubExample extends FinalExample {

    // Uncommenting below would cause a compile error
    // void display() {
    //     System.out.println("Trying to override a final method.");
    // }
}

public class finalKeyWord {
    public static void main(String[] args) {
        FinalExample example = new FinalExample();
        System.out.println(example.MAX_VALUE);
        example.display();
    }
}

// final keyword is used to prevent overridden or class to be inherited
// whenevr you declare final as before return type it becomes final value of method of that class

package functions;

public class swap{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
        swap2(a,b);
        
        System.out.println(a + " " + b);

        String name = "Vikash Shakya";
        // changeName(name);
        System.out.println(name);
    }

    // static void changeName(String name){
    //     String message = "hello" + name;
    //     return message;
    // }

    static void swap2(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}




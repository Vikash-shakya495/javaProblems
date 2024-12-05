package packages.staticExample;

public class Main {
    // here static method is called without it's object and if you want use without static then you actually need to creat object of main method
    public static void main(String[] args) {
        // Static method call
        // Human Vikash = new Human(19, "Vikash Shakya", 10000, false);
        // Human Rahul = new Human(34, "Rahul Kumar", 20000, true);
        // Human Sneha = new Human(20, "Sneha kumari", 15000, true);

        // // static variable doesnt't need of objects to be created
        // System.out.println(Vikash.population);
        // System.out.println(Rahul.population);
        // greeting();

        Main fun = new Main();
        fun.fun2();
    }

    // it doesn't depend on object
    // it doesn't belongs to instance
    static void fun(){

        // greeting(); //  you cannot use this because it requires an intance
        // but the function you are using it in does not depened on instances

        Main obj = new Main();
        obj.greeting(); // you cannot access non static stuff without referencing their instances in a static context

    }
    void fun2(){
        greeting();
        System.out.println("I am inside in fun 2");
    }

    // inside this static method you cannot use any non-static method
    // we know that something which is not static belongs to an object
    // it belongs to instance
    void greeting(){
        fun(); // it will works
        System.out.println("i am here is Main");
    }
}

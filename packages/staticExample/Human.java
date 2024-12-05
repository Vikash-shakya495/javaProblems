package packages.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    static void message(){
        System.out.println("hello world");
        System.out.println(this.age); // here message is static method this is refer to an object, hence cannot use this keyword in static method
    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

}

class Animal{
    String color = "white";
    int legs = 4;
    void sound(){
        System.out.println("bark");
    }
}
class Dog extends Animal{
    String color = "black";
    @Override void sound(){
        System.out.println("Woof");
    }
    void display(){
        System.out.println(color);
        System.out.println(super.color);
        System.out.println(super.legs);
    }
}

class Cat extends Animal{
    String color = "gray";
    @Override void sound(){
        System.out.println("Meow");
    }
    void display(){
        System.out.println(color);
        System.out.println(super.color);
        System.out.println(super.legs);
    }
}

public class super1 {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat =  new Cat();
        Animal animal = new Dog();
        dog.display();
        cat.display();
        animal.sound();
    }
}

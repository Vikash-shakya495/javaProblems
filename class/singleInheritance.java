class Animal {  // Superclass
    void eat() {
      System.out.println("Eating...");
    }
  }
  
  class Dog extends Animal {  // Subclass
    void bark() {
      System.out.println("Barking...");
    }
  }
  
  public class singleInheritance {
    public static void main(String[] args) {
      Dog d = new Dog();
      d.eat();  // Inherited from Animal
      d.bark(); // Dog class method
    }
  }
  
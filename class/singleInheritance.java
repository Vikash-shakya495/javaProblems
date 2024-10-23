// single inheritance
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

  
/** 
    1. Single Inheritance
A subclass inherits from a single superclass. It’s the simplest form of inheritance.
    2. Multilevel Inheritance
A class inherits from a superclass, and another class inherits from that subclass, forming a chain.
  
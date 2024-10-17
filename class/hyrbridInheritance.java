interface Mammal {
    void speak();
  }
  
  class Animal {
    void sleep() {
      System.out.println("Sleeping...");
    }
  }
  
  class Dog extends Animal implements Mammal {
    public void speak() {
      System.out.println("Barking...");
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      Dog d = new Dog();
      d.sleep();  // From Animal class
      d.speak();  // From Mammal interface
    }
  }
  
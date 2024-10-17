class Student {
    String name ="vikash";
    int age = 19;

    // Constructor with parameters having the same name as instance variables
    Student(String name, int age) {
        this.name = name;  // 'this.name' refers to the instance variable
        this.age = age;    // 'this.age' refers to the instance variable
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        Student student = new Student("John", 20);
        student.display();  // Output: Name: John, Age: 20
    }
}

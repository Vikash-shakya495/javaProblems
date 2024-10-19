// Student.java
public class Student {
    int student_Id;
    String student_name;
    double age;
    char grade;

    // Constructor (optional, Java provides a default constructor if none is defined)
    public Student() {}

    // Setter method
    public void set(int id, String name, double a, char g) {
        student_Id = id;
        student_name = name;
        age = a;
        grade = g;
    }

    // Getter method
    public void get() {
        System.out.println("Student id : " + student_Id);
        System.out.println("Student Name : " + student_name);
        System.out.println("Student age : " + age);
        System.out.println("Student grade : " + grade);
    }
}

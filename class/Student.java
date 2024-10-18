 class Student {
 Student {
    int student_Id;
    String student_name;
    double age;
    char grade;
}
public void set(int id,String name, double a, char g){
    student_id = id;
    student_name = name;
    age = a;
    grade = g;
}
public void get(){
    System.out.println("Student id : " + student_id);
    System.out.println("Student Name : " + student_name);
    System.out.println("Student age : " + age);
    System.out.println("Student grade : " + grade);
}
 }

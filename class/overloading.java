class object{
    void display(String name){
        System.out.println("My name is " + name);
    }
    void display(String name, int age){
        System.out.println("and age is " + age);
    }
    void display(String name, String dob){
        System.out.println("name is "+ name  + " and born in " + dob);
    }
}

public class overloading {
    public static void main(String[] args){
        object obj = new object();
        obj.display("Vikash");
        obj.display("vikash" , 19);
        obj.display("vikash" , "04/09/2005" );
    }
}


// there basically two types of polymorphism
// 1. compile time polymorphism (method overloading)
// 2. runtime polymorphism (method overriding)
// complie time polymorphism further divided into two parts 
//      Function Overloading
//      Operator Overloading
// runtime polymorphism
//      Virtual functions
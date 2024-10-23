public class person {
    String name;
    int age;
    String address;
    person(String n){
        name = n;
        age = 19;
        address = "59 house no, divlyalok colony, mathura";
    }
    void get(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("address: "+address);
    }
}

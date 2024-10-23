public class Car {
    String brand;
    String model;
    int year;
    Car(){
        brand = "Maruti suzuki";
        model = 1998;
        year = 2012;
    }
    void get(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("year: "+year);
    }
}

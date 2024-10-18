class Car{
    String name;
    int year;
    float price;
}

public class classNObjects {
    public static void main(String[] args) {
        Car carDesign = new Car();
        carDesign.name = "ford";
        carDesign.year = 2022;
        carDesign.price = 22200.4f;
        
        System.out.println("Car name is : " + carDesign.name);
        System.out.println("Year of released is : " + carDesign.year);
        System.out.println("And the price is : " + carDesign.price);
    }
}

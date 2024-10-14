class circle{
    double radius,area;
    circle(){
        radius = 0;
    }
    calarea(){
        int pi = 3.14;
        int area = pi * r * 2;
        System.out.println(area);
    }
}
public class constructor1{
    public static void main(String[] args) {
        circle c1 = new circle(2);
        c1.calarea();
    }
}


no-argument constructor
parametrized constructor
constructor overloading
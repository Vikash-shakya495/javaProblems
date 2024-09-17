import java.util.Scanner;


class Rectangle{
    int length,breadth,area;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth : ");
        length = sc.nextInt();
        breadth = sc.nextInt();
    }
    void calculate_area(){
        area = length * breadth;
    }
    void display(){
        System.out.println("Length of rectange : " + length);
        System.out.println("Breath of rectange : " + breadth);
        System.out.println("Area of rectangle is : "+area);
    }
}  

public class firstClass {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        Rectangle r2 = new Rectangle();
        r2.input();
        r2.calculate_area();
        r2.display();
    }  
}

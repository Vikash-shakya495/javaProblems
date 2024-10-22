public class rectangle {
    int l;
    int b;
    int area;
    rectangle(){
    }
    void display(){
        this.area = l * b;
        System.out.println("length = "+this.l+", breadth = "+this.b);
        System.out.println("The area of rectangle : " + this.area);
    }
}
public class findAreaOfrect{
    public static void main(String[] args) {
        rectangle rect= new rectangle();
        rect.l=10;
        rect.b=20;
        rect.display();
    }
}

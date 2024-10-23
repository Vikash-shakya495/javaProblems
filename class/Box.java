public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // CUBE
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // passing box
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box : ");
    }
    public static void main(String[] args) {
        Box box = new Box(4.6 , 7.9 , 3.4);
        Box box2 = new Box(box);
        System.out.println(box.l + " " + box.w + " " + box.h);
    }
}

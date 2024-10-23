import javax.swing.Box;

public class BoxOfWeight extends Box{
    double weight;
    public BoxOfWeight(){
        this.weight = -1;
    }
    BoxOfWeight(double l, double h, double w, double weight){
        super(l,h,w);
        this.weight = weight;
    }
    public static void main(String[] args) {
        BoxOfWeight box3 = new BoxOfWeight();
        // BoxOfWeight box4 = new BoxOfWeight(2,4,8);
        System.out.println(box3.h + " " + box3.w +  " " + box3.l);
    }
}

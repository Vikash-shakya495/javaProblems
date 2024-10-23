public class Static {
    static int count = 0; // common to all objects
    Static() {
        count++;
    }
    void display(){
        System.out.println(count);
    }
    public static void main(String[] args) {
        Static c1 = new Static();
        Static c2 = new Static();
        Static c3 = new Static();
        c1.display(); //3
        c2.display(); //3
        c3.display(); //3
    }
}


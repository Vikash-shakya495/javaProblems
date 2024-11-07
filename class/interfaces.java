interface printable {
    public static final String color = "black";

    public abstract void printing();
}

interface drawable {
    public abstract void drawing();
}

class square implements printable, drawable {
    public void printing() {
        System.out.println("printing square");
    }

    public void drawing() {
        System.out.println("drawing square");
    }
}

public class interfaces {
    public static void main(String[] args) {
        square square = new square();
        square.printing();
        square.drawing();
        System.out.println("this is the color of drawing : " + square.color);
    }
}

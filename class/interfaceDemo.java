public // Program Implementation 1

interface area {
    final static float pi = 3.14F;

    float calculate(float x, float y);
}

class rectangle implements area {
    public float calculate(float x, float y) {
        return x * y;
    }
}

class circle implements area {
    public float calculate(float x, float y) {
        return pi * x * x;
    }
}
class interfaceDemo {
    public static void main(String args[]) {
        rectangle rect = new rectangle();
        circle cir = new circle();
        area a;

        // Calculate area of rectangle
        a = rect;
        System.out.println("Area of Rectangle = " + a.calculate(10, 20));

        // Calculate area of circle
        a = cir;
        System.out.println("Area of Circle = " + a.calculate(10, 0));
    }
}

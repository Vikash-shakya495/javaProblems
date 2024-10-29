// polymorphism

public class shapesCategory {
    void area(){
        System.out.println("i am in shapes");
    }
}
class circle extends shapesCategory{
    void area(){
        System.out.println("Area in circle");
    }
}
class triangle extends shapesCategory{
    void area(){
        System.out.println(" Area in triangle");
    }

}
class square extends shapesCategory{
    void area(){
        System.out.println(" Area in square");
    }
}

public class shapes{
    public static void main(String[] args) {
         shapesCategory shape = new shapesCategory();
         circle circ = new circle();
         triangle tri = new triangle();
         shapesCategory squr = new square();
        //  shape.area();
         shape.area();
    }
}
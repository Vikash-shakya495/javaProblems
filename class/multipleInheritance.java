// Interface for Father behavior
interface Father {
    int fatherProperties = 8000;  // By default, properties in interfaces are static and final

    void fatherDis();  // Declare the method to be implemented by Son
}

// Interface for Mother behavior
interface Mother {
    int motherProperties = 3000;

    void motherDis();  // Declare the method to be implemented by Son
}

// Base class GrandMother
class GrandMother {
    int grandMotherProperties = 4000;

    void grandDis() {
        System.out.println("GrandMother disposed having property: " + grandMotherProperties);
    }
}

// Son class implements both Father and Mother interfaces, and extends GrandMother class
class Son extends GrandMother implements Father, Mother {
    int sonProperties = 150;

    // Implementing the method from Father interface
    public void fatherDis() {
        System.out.println("Father salary is " + fatherProperties + " and GrandMother has " + grandMotherProperties);
    }

    // Implementing the method from Mother interface
    public void motherDis() {
        System.out.println("Mother currently has " + motherProperties + " and GrandMother has " + grandMotherProperties);
    }

    // Son-specific method
    void sonDis() {
        System.out.println("Son's pocket money is " + sonProperties);
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        Son son = new Son();
        son.grandDis();    // From GrandMother class
        son.motherDis();   // From Mother interface
        son.fatherDis();   // From Father interface
        son.sonDis();      // Son's own method
    }
}

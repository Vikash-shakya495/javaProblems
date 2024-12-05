package packages.abstract;

public class Main{
    public static void main(String[] args) {
        // Using Son class
        Parent son = new Son();
        son.career();
        son.partner();

        Parent daughter = new Daughter();
        daughter.career();
        daughter.partner();

        Parent.hello();
    }
}
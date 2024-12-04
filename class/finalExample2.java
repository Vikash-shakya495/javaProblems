class A{
    final int num =10;
    String name;

    public A(String name){
        this.name = name;
    }
}
public class finalExample2 {
    public static void main(String[] args) {
        final A vikash = new A("vikash shakya");
        vikash.name = "other name";
        vikash = new a("othername");
        System.out.println(vikash.name);
    }
}

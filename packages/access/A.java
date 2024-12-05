package packages.access;

public class A {
    private int num;
    // int num; default is allowed to same package, but not in different package
    String name;
    int[] arr;
    public int getNum(){
        return num;
    }
    public A(int num, String name){
        this.num = num;
        this.name = name
        this.arr =new int[num];
    }
}

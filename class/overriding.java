interface one{
    public void print_geeks();
}

interface two{
    void print_for();
}
interface three extends one,two{
    void print_geeks();
}
class child implements three{
 @Override public void print_geeks(){
        System.out.print("Geeks");
    }
    public void print_for(){
        System.out.print("for");
    }
}

public class overriding {
    public static void main(String[] args){
        child c = new child();
        c.print_geeks();
        c.print_for();
        c.print_geeks();
    }
}

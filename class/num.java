class numbers{
    int sum(int a , int b){
        return a + b;
    }
    int sum(int b, int a, int c){
        return a + b + c;
    }
}

public class num {
    public static void main(String[] args) {
         numbers obj = new numbers();
         obj.sum(3, 8);
         obj.sum(10, 20, 40);
    }
}

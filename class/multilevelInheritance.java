class a{
    void show_a(){
        System.out.println("\n method show_a called");
    }
}
class b extends a{
    void show_b(){
        System.out.println("\n method show_b called");
    }
}
class c extends b{
    void show_c(){
        System.out.println("\n method show_c called");
    }
}
class Multilevel1{
    public static void main(String[] args) {
        c c1;
        c1.show_a();
        c1.show_b();
        c1.show_c();
    }
}
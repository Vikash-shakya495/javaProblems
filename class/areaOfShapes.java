class shapes{
    void area(int side){
        System.out.println(side*side);
    }
    void area(int l, int b){
        System.out.println(l*b);
    }

    public static void main(String[] args){
        shapes obj = new shapes();
        obj.area(4);
        obj.area(3,8);
    }
}
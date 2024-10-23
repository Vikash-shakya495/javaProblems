public class book {
    String title;
    String author;
    double price;

    // paramized constructor
    book(String t, String a,double p){
        title = t;
        author = a;
        price = p;
    }
    void display(){
        System.out.print("The book name : " + title);
        System.out.print("written by " +author);
        System.out.print("price is " + price);
    }
}


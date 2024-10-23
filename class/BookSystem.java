import java.util.Scanner;

public class BookSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book name");
        String title = sc.nextLine();
        System.out.println("Enter Author of this book");
        String author = sc.nextLine();
        System.out.println("Enter the price of book");
        double price = sc.nextDouble();
        book newBook = new book(title,author,price);
        newBook.display();
    }
}

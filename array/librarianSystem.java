import java.util.*;

public class librarianSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] books = new String[5];
        for(int i = 0; i < books.length ; i++){
            books[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(books));

        boolean found = false;
        String searchBook = sc.nextLine();
        for(int i = 0; i < books.length; i++){
            if(searchBook.equals(books[i])){
                System.out.println("Book found at index " + i + ", the name of book is : " + searchBook);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Book not found");
        }
    }
}

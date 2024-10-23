class Book {
    String title;
    String author;
    double price;

    // Parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("The book name: " + title);
        System.out.println("Written by: " + author);
        System.out.println("Price: $" + price);
        System.out.println(); // Add an empty line for better readability
    }
}
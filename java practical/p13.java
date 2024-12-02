class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    
    public Book(String title) {
        this.title = title;
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}
public class p13 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        Book book1 = new Book();
        System.out.println("\nDefault Constructor");
        book1.display();
        
        System.out.println("\n1 Argument Constructor");
        Book book2 = new Book("1984");
        book2.display();
        
        System.out.println("\n2 Argument Constructor");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");
        book3.display();
        
        System.out.println("\n3 Argument Constructor");
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        book4.display();
    }
}
public class Book {
    private String title;
    private String author;
    private double price;
    public Book()
    {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0.0; //  check price not 0
        }
    }

    public void displayDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price = " + price);
    }

    public void updatePrice(double newPrice)
    {
        // Check if the new price is valid
        if (newPrice >= 0) {
            this.price = newPrice;
        } else {
            System.out.println("Invalid price. Price set a non-negative value.");
        }
    }
    public void applyDiscount(double discount)
    {
        if (discount >= 0 && discount <= 100)
        {
            this.price = price * (1 - discount/100);
        }
        else
        {
            System.out.println("Discount is invalid");
        }
    }

    // Main method to test the Book class
    public static void main( String arg[]) {
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        Book hp1Book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 350.00);
        hp1Book.applyDiscount(12.5);
        hp1Book.displayDetails();

        hp1Book.updatePrice(32000.00);
        hp1Book.displayDetails();
    }

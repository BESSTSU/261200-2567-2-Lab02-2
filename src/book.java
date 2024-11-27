public class book {
    // Fields to store book details
    private String title;
    private String author;
    private double price;

    // Default constructor
     book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
     book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        // Ensure price is valid
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0.0; // If price is invalid (negative), set to default 0.0
        }
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Method to update the book's price
    void updatePrice(double newPrice) {
        // Check if the new price is valid (non-negative)
        if (newPrice >= 0) {
            this.price = newPrice;
        } else {
            System.out.println("Invalid price. Price must be a non-negative value.");
        }
    }

    // Main method to test the Book class
     static void main(String[] args) {
        // Create a book using the default constructor
        book book1 = new book();
        book1.displayDetails(); // Display details for book1

        // Create a book using the parameterized constructor
        book book2 = new book("Java Programming", "John Doe", 29.99);
        book2.displayDetails(); // Display details for book2

        // Update price of the second book
        book2.updatePrice(35.99);
        book2.displayDetails(); // Display updated details for book2

        // Try to set an invalid price
        book2.updatePrice(-5.0); // This should show an error message
    }
}
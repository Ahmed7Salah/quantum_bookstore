import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private static Map<String, Book> books = new HashMap<>();

    // Static methods
    public static void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public static Book removeBook(String isbn) {
        return books.remove(isbn);
    }

    public static void removeOutdated() {
        for (Book book : books.values()) {
            if (book.isOutdated(2025, 10)) {
                System.out.println(removeBook(book.getIsbn()).getTitle() + " is removed");
            }
        }
    }


    public static double buyBooks(String isbn, int quantity, String address, String email) {
        Book book = books.get(isbn);
        // check if it's a demo book
        if (!book.isAvailable()) throw new IllegalStateException("Demo Books are not available for sale");

        if (book instanceof Shippable && address != null) {
            ShippingService.send(address, book);
            ((PaperBook) book).reduceQuantity(quantity);
            return book.getPrice() * quantity;
        } else if (book instanceof Emailable && email != null) {
            MailService.sendEbook(email, book);
            return book.getPrice();
        } else {
            throw new IllegalStateException("an Error occured: please provide an address or email for your order");
        }
    }

    // for Ebooks
    public static double buyBooks(String isbn, String email) {
        return buyBooks(isbn, 1, null, email);
    }


}



public class ShippingService {
    public static void send(String address, Book book) {
        System.out.printf("Sending %s to %s%n", book.getTitle(), address);
    }
}

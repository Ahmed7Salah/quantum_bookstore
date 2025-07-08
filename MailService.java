public class MailService {
    public static void sendEbook(String email, Book book) {
        System.out.printf("Emailing %s to %s%n", book.getTitle(), email);
    }
}

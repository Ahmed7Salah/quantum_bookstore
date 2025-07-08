public class DemoBook extends Book{
    DemoBook(String isbn, String title, int yearPublished, String author) {
        super(isbn, title, 0, yearPublished, author);
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

}

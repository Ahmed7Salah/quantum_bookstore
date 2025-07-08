public class EBook extends Book implements Emailable {
    private String fileType;

    public EBook(String isbn, String title, double price, int yearPublished, String author, String fileType) {
        super(isbn, title, price, yearPublished, author);
        this.fileType = fileType;
    }

    // getter

    public String getFileType () {
        return this.fileType;
    }
}

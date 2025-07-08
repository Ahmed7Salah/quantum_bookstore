public abstract class Book {
    private String isbn;
    private String title;
    private double price;
    private int yearPublished;
    private String author;

    public Book(String isbn, String title, double price, int yearPublished, String author) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.yearPublished = yearPublished;
    }

    // getters

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYearPublished() {
        return this.yearPublished;
    }

    public String getAuthor() {
        return this.author;
    }

    // helper methods
    
    public boolean isOutdated(int currentYear, int maxYearsOld) {
        return (currentYear - this.yearPublished) > maxYearsOld;
    }

    // is available for sale
    public boolean isAvailable() {
        return true;
    }



}

public class PaperBook extends Book implements Shippable {
    private int quantity;

    PaperBook(String isbn, String title, double price, int yearPublished, String author, int quantity) {
        super(isbn, title, price, yearPublished, author);
        this.quantity = quantity;
    }


    // getters

    public int getQuantity() {
        return this.quantity;
    }

    // helper methods

    public void reduceQuantity(int amount) {
        this.quantity -= amount;
    }

}

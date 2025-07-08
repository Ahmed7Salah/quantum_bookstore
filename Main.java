public class Main {
    public static void main(String[] args) {

        // Adding books to the inventory
        Inventory.addBook(new PaperBook("1f2", "Rich Dad Poor Dad", 52, 2005, "Robert Kiyosaki", 5));
        Inventory.addBook(new EBook("23t", "Harry Potter and the Sorcerer's Stone", 23, 2019, "J. K. Rowling", "PDF"));
        Inventory.addBook(new DemoBook("rge3", "Atomic Habits", 2018, "Jake"));
        // Buying books
        System.out.println("Buying 2 copies of Rich Dad Poor Dad " + Inventory.buyBooks("1f2", 2, "New Jersey 2nd Street", null) + " $");
        System.out.println("Buying Ebook Harry Potter and the Sorcerer's Stone " + Inventory.buyBooks("23t", "ahmed@hotmail.com") + " $");

        // Removing outdated books
        Inventory.removeOutdated();

        // Buying Demo books
        try {
            Inventory.buyBooks("rge3", 1, "New Jersey 2nd Street", null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Removing all books
        Inventory.removeBook("123");
        Inventory.removeBook("456");
        Inventory.removeBook("789");


    }
}
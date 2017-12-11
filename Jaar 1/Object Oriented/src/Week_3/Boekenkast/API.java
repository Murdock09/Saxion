package Week_3.Boekenkast;

public class API {
    private BoekenKast boekenKast, boekenKast2;

    public static void main(String[] args) {
        new API().run();
    }

    private void run() {
        boekenKast = new BoekenKast(20, "1");
        boekenKast2 = new BoekenKast(20, "2");

        addBooks(boekenKast); // Add books
        addBooks(boekenKast2); // Add books

        findDups(boekenKast); // Find duplicates
        findDups(boekenKast2); // Find duplicates

        extra(boekenKast); // Extra info from bookcase 1
        extra(boekenKast2); // Extra info from bookcase 2

        byAuthor(boekenKast, "Stijn"); // Get books by author Stijn from bookcase 1
        byAuthor(boekenKast2, "Stijn124"); // Get books by author Stijn124 from bookcase 2

        exchangeBooks(boekenKast, boekenKast2, 3); // Exchange by a number
        printAll(boekenKast); // print all books from bookcase 1
        printAll(boekenKast2); // print all books from bookcase 2

        exchangeBooks(boekenKast2, boekenKast, 1); // Exchange by a number
        printAll(boekenKast); // print all books from bookcase 1
        printAll(boekenKast2); // print all books from bookcase 2
    }

    /**
     * Exchange books
     *
     * @param toRemoveFrom speaks for itself
     * @param toAddTo      speaks for itself
     * @param i            speaks for itself
     */
    private void exchangeBooks(BoekenKast toRemoveFrom, BoekenKast toAddTo, int i) {
        print("\r\nExchanging book number " + i + " from " + toRemoveFrom.toString() + " to " + toAddTo.toString());
        toAddTo.addBook(toRemoveFrom.remove(i));
    }

    /**
     * Add books
     *
     * @param boekenKast speaks for itself
     */
    private void addBooks(BoekenKast boekenKast) {
        boekenKast.addBook(new Boek(1231, "Stijn", 20, new Auteur("Stijn", 50)));
        boekenKast.addBook(boekenKast.getBooks().get(0));
        boekenKast.addBook(boekenKast.getBooks().get(0));
        boekenKast.addBook(new Boek(12312, "Stin", 20, new Auteur("Stijn", 52)));
        boekenKast.addBook(new Boek(1231, "Ase", 20, new Auteur("Stijn124", 50)));
        boekenKast.addBook(boekenKast.getBooks().get(4));
    }

    /**
     * Find duplicates in book case
     *
     * @param boekenKast speaks for itself
     */
    private void findDups(BoekenKast boekenKast) {
        System.out.println("Duplicated books:");
        for (Boek b : boekenKast.getDuplicates()) {
            print("\t" + b);
        }
    }

    /**
     * Extra functions inside bookcase
     *
     * @param boekenKast speaks for itself
     */
    private void extra(BoekenKast boekenKast) {
        print("\r\nOldest author: " + boekenKast.oldestAuthor());
        print("Total pages of bookcase: " + boekenKast.totalPages());
        print("Amount of books in bookcase: " + boekenKast.booksInside());
        print("Removing book at index 5: " + boekenKast.remove(5));
        print("Amount of books in bookcase: " + boekenKast.booksInside());
    }

    /**
     * Get all books from bookcase by author
     *
     * @param boekenKast speaks for itself
     * @param name       speaks for itself
     */
    private void byAuthor(BoekenKast boekenKast, String name) {
        print("\r\nBooks by author " + name + " :");
        for (Boek b : boekenKast.getBooksByAuthor(name)) {
            print("\t" + b);
        }
    }

    /**
     * Print all books in bookcase
     *
     * @param boekenKast speaks for itself
     */
    private void printAll(BoekenKast boekenKast) {
        System.out.println("\r\nPrinting bookcase " + boekenKast.toString());
        for (Boek b : boekenKast.getBooks()) {
            print("\t" + b);
        }
    }

    /**
     * Helping print method
     *
     * @param o speaks for itself
     */
    private void print(Object o) {
        System.out.println(o);
    }
}

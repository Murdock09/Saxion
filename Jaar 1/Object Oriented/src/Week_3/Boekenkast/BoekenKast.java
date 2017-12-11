package Week_3.Boekenkast;

import java.util.*;
import java.util.stream.Collectors;

public class BoekenKast {
    private int maxBooks;
    private ArrayList<Boek> books;
    private String name;

    /**
     * Bookcase constructor
     *
     * @param maxBooks speaks for itself
     * @param name     speaks for itself
     */
    BoekenKast(int maxBooks, String name) {
        this.maxBooks = maxBooks;
        this.name = name;
        books = new ArrayList<>();
    }

    /**
     * Add a book
     *
     * @param book speaks for itself
     * @return true or false when added
     */
    boolean addBook(Boek book) {
        return books.size() <= maxBooks && books.add(book);
    }

    /**
     * Remove by index
     *
     * @param i speaks for itself
     * @return removed book
     */
    Boek remove(int i) {
        return books.remove(i);
    }

    /**
     * Book amount inside
     *
     * @return amount
     */
    int booksInside() {
        return books.size();
    }

    /**
     * Total pages in bookcase
     *
     * @return total pages
     */
    int totalPages() {
        int pages = 0;
        for (Boek b : books) {
            pages += b.getPaginas();
        }
        return pages;
    }

    /**
     * Get oldest author
     *
     * @return oldest author
     */
    Auteur oldestAuthor() {
        Auteur auteur = null;
        for (Boek b : books) {
            if (auteur == null) {
                auteur = b.getAuteur();
                continue;
            }
            if (b.getAuteur().getLeeftijd() < auteur.getLeeftijd()) {
                continue;
            }
            auteur = b.getAuteur();
        }
        return auteur;
    }

    /**
     * Get the duplicates
     *
     * @return set of duplicates
     */
    Set<Boek> getDuplicates() {
        Set<Boek> uniques = new HashSet<>();
        return this.books.stream() //Create a stream
                .filter(e -> !uniques.add(e)) // Filter the not unique values
                .collect(Collectors.toSet()); // Collect the items and transform it to a set for unique values.
    }

    /**
     * Get books by author name
     *
     * @param name of author
     * @return books
     */
    ArrayList<Boek> getBooksByAuthor(String name) {
        ArrayList<Boek> boeks = new ArrayList<>();
        for (Boek b : this.books) {
            if (b.getAuteur().getNaam().equalsIgnoreCase(name)) {
                boeks.add(b);
            }
        }
        return boeks;
    }

    //speaks for itself
    ArrayList<Boek> getBooks() {
        return books;
    }

    //speaks for itself
    @Override
    public String toString() {
        return name;
    }
}

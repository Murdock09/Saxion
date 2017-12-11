package Week_3.Boekenkast;

public class Boek {
    private int isbn;
    private String titel;
    private int paginas;
    private Auteur auteur;

    public Boek(int isbn, String titel, int paginas, Auteur auteur) {
        this.isbn = isbn;
        this.titel = titel;
        this.paginas = paginas;
        this.auteur = auteur;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitel() {
        return titel;
    }

    public int getPaginas() {
        return paginas;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    @Override
    public boolean equals(Object o) {
        Boek b = (Boek)o;
        return b.titel.equals(titel) && b.isbn == isbn && b.paginas == paginas && b.auteur == auteur;
    }

    @Override
    public String toString() {
        return "Boek{" +
                "isbn=" + isbn +
                ", titel='" + titel + '\'' +
                ", paginas=" + paginas +
                ", auteur=" + auteur +
                '}';
    }
}

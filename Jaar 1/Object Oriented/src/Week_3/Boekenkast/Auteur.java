package Week_3.Boekenkast;

public class Auteur {
    private String naam;
    private int leeftijd;

    public Auteur(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    @Override
    public boolean equals(Object o) {
        Auteur a = (Auteur)o ;
        return a.getLeeftijd() == leeftijd && a.getNaam().equals(naam);
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                '}';
    }
}

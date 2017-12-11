package Week_2;

import java.util.ArrayList;

public class Prison {
    private ArrayList<Prisoner> prisoners;

    public Prison() {
        prisoners = new ArrayList<>();
        this.addPrisoner(new Prisoner("Jack the Ripper", "Murder", 38, 40, true));
        this.addPrisoner(new Prisoner("Neptunus", "Killing the dead sea", 53, 80, true));
        this.addPrisoner(new Prisoner("Justin Bieber", "Yelling", 16, 7, true));
        this.addPrisoner(new Prisoner("Harry Potter", "Killing Voldemort", 18, 3, true));
        this.addPrisoner(new Prisoner("Demo dog", "Attempted to kill Eleven", 2, 2, true));
    }

    /**
     * Add a new prisoner to the system
     *
     * @param prisoner
     */
    public void addPrisoner(Prisoner prisoner) {
        this.prisoners.add(prisoner);
    }

    /**
     * Return a list of prisoners who committed a certain crime
     *
     * @param text has committed a certain crime
     * @return prisoners
     */
    public ArrayList<Prisoner> hasCommitted(String text) {
        text = text.toLowerCase();
        ArrayList<Prisoner> prisoners = new ArrayList<>();
        for (Prisoner p : this.prisoners) {
            String prisonerCrime = p.getCrime().toLowerCase();
            if (!prisonerCrime.contains(text+" ")) {
                continue;
            }
            prisoners.add(p);
        }
        return prisoners;
    }

    /**
     * Return a list of prisoners who are in solitary
     *
     * @return prisoners
     */
    public ArrayList<Prisoner> inSolitary() {
        ArrayList<Prisoner> prisoners = new ArrayList<>();
        for (Prisoner p : this.prisoners) {
            if (!p.isSolitary()) {
                continue;
            }
            prisoners.add(p);
        }
        return prisoners;
    }

    /**
     * Return a list of prisoners who are above a certain age
     * @param age threshold
     * @return prisoners
     */
    public ArrayList<Prisoner> aboveAge(int age) {
        ArrayList<Prisoner> prisoners = new ArrayList<>();
        for (Prisoner p : this.prisoners) {
            if (p.getAge() <= age) {
                continue;
            }
            prisoners.add(p);
        }
        return prisoners;
    }

    /**
     * Return all prisoners
     *
     * @return
     */
    public ArrayList<Prisoner> getPrisoners() {
        return prisoners;
    }
}

package Week_3.PrisonAdmin;

import java.util.ArrayList;

class Prison {
    private ArrayList<Prisoner> prisoners;
    private ArrayList<Cell> cells;
    private ArrayList<HoldingCell> holdingCells;
    private static int CELL_NUMBER = 0;

    Prison() {
        prisoners = new ArrayList<>();
        this.addPrisoner(new Prisoner("Jack the Ripper", "Murder", 38, 40, true));
        this.addPrisoner(new Prisoner("Neptunus", "Killing the dead sea", 53, 80, true));
        this.addPrisoner(new Prisoner("Justin Bieber", "Yelling", 16, 7, true));
        this.addPrisoner(new Prisoner("Harry Potter", "Killing Voldemort", 18, 3, true));
        this.addPrisoner(new Prisoner("Demo dog", "Attempted to kill Eleven", 2, 2, true));

        cells = new ArrayList<>();
        holdingCells = new ArrayList<>();
        this.bindPrisoner(prisoners.get(0));
        this.bindPrisoner(prisoners.get(1));
        this.bindPrisoner(prisoners.get(2));
        this.bindPrisoner(prisoners.get(3));
        this.bindPrisoner(prisoners.get(4));
    }

    /**
     * Add a new prisoner to the system
     *
     * @param prisoner
     */
    void addPrisoner(Prisoner prisoner) {
        this.prisoners.add(prisoner);
    }

    /**
     * Create a new cell and bind a prisoner to it
     *
     * @param prisoner
     */
    void bindPrisoner(Prisoner prisoner) {
        this.cells.add(new Cell(CELL_NUMBER++, prisoner));
    }

    /**
     * Return a list of prisoners who committed a certain crime
     *
     * @param text has committed a certain crime
     * @return prisoners
     */
    ArrayList<Prisoner> hasCommitted(String text) {
        text = text.toLowerCase();
        ArrayList<Prisoner> prisoners = new ArrayList<>();
        for (Prisoner p : this.prisoners) {
            String prisonerCrime = p.getCrime().toLowerCase();
            if (!prisonerCrime.contains(text + " ")) {
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
    ArrayList<Prisoner> inSolitary() {
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
     *
     * @param age threshold
     * @return prisoners
     */
    ArrayList<Prisoner> aboveAge(int age) {
        ArrayList<Prisoner> prisoners = new ArrayList<>();
        for (Prisoner p : this.prisoners) {
            if (p.getAge() <= age) {
                continue;
            }
            prisoners.add(p);
        }
        return prisoners;
    }

    void printCells() {
        for (Cell c : cells) {
            System.out.println(c);
        }
    }

    void holdingCell() {
        HoldingCell holdingCell = new HoldingCell(3);
        System.out.println(holdingCell.addPrisoner(prisoners.get(0)));
        System.out.println(holdingCell.addPrisoner(prisoners.get(1)));
        if (holdingCell.fits()) {
            System.out.println("Holding cell not full");
        } else {
            System.out.println("Holding cell full");
        }
        holdingCells.add(holdingCell);
        HoldingCell holdingCell2 = new HoldingCell(2);
        System.out.println(holdingCell2.addPrisoner(prisoners.get(0)));
        System.out.println(holdingCell2.addPrisoner(prisoners.get(1)));
        if (holdingCell2.fits()) {
            System.out.println("Holding cell not full");
        } else {
            System.out.println("Holding cell full");
        }
        holdingCells.add(holdingCell2);
    }

    boolean fitsInHoldingCell(int i) {
        return holdingCells.get(i).fits();
    }

    int fitsNew(int i) {
        return  holdingCells.get(i).getFitsAmount()-holdingCells.get(i).getInside();
    }

    int inside(int i){
        return holdingCells.get(i).getInside();
    }
    /**
     * Return all prisoners
     *
     * @return
     */
    ArrayList<Prisoner> getPrisoners() {
        return prisoners;
    }
}

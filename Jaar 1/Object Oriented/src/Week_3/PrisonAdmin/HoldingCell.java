package Week_3.PrisonAdmin;

import java.util.ArrayList;

public class HoldingCell {
    private int fitsAmount;
    private ArrayList<Prisoner> prisoners;

    /**
     * Constructor
     *
     * @param fitsAmount amount of prisoners that fit in here
     */
    HoldingCell(int fitsAmount) {
        this.fitsAmount = fitsAmount;
        prisoners = new ArrayList<>();
    }

    boolean addPrisoner(Prisoner prisoner) {
        return fits() && prisoners.add(prisoner);
    }

    /**
     * How many prisoners are currently inside
     *
     * @return the amount of people currently inside
     */
    public int getInside() {
        return prisoners.size();
    }

    /**
     * Getter
     *
     * @return current amount that fit in this cell
     */
    public int getFitsAmount() {
        return fitsAmount;
    }

    /**
     * Check if new prisoners fit inside
     *
     * @return bool
     */
    public boolean fits() {
        return prisoners.size() < fitsAmount;
    }
}

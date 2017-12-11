package Week_3.PrisonAdmin;

public class Cell {
    private int cellNumber;
    private Prisoner prisoner;

    Cell(int cellNumber, Prisoner prisoner) {
        this.cellNumber = cellNumber;
        this.prisoner = prisoner;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public Prisoner getPrisoner() {
        return prisoner;
    }

    @Override
    public String toString() {
        return "Cell:\r\n" +
                "\tcellNumber " + cellNumber +
                "\r\n\tprisoner = " + prisoner;
    }
}

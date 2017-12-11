package Week_3.PrisonAdmin;

import java.util.ArrayList;

public class API {
    public static void main(String[] args) {
        new API().run();
    }

    private void run() {
        Prison prison = new Prison();
        prison.addPrisoner(new Prisoner("I'm a Thief", "Attempted to kill kittens", 34, 4, false));

        ArrayList<Prisoner> commitedCrimes = prison.hasCommitted("kill");
        ArrayList<Prisoner> inSolitary = prison.inSolitary();
        ArrayList<Prisoner> aboveAge = prison.aboveAge(45);

        System.out.println("These prisoners commited crimes with \"kill\":");
        for (Prisoner p :
                commitedCrimes) {
            System.out.println("\t"+p);
        }
        System.out.println("");
        System.out.println("These prisoners are in solitary:");
        for (Prisoner p :
                inSolitary) {
            System.out.println("\t"+p);
        }
        System.out.println("");
        System.out.println("These prisoners are older than 45:");
        for (Prisoner p :
                aboveAge) {
            System.out.println("\t"+p);
        }
        System.out.println(" ");
        System.out.println("These are all the prisoners the system has:");
        for (Prisoner p :
                prison.getPrisoners()) {
            System.out.println("\t"+p);
        }
        System.out.println("");
        prison.printCells();
        System.out.println("");
        prison.holdingCell();
        System.out.println();
        System.out.println(prison.fitsInHoldingCell(0));
        System.out.println(prison.fitsInHoldingCell(1));
        System.out.println(prison.fitsNew(0));
        System.out.println(prison.fitsNew(1));
        System.out.println(prison.inside(0));
        System.out.println(prison.inside(1));
    }
}
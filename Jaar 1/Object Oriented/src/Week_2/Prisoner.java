package Week_2;

/**
 * DID YOU JUST ASSUME MY GENDER
 */
public class Prisoner {
    private String name,
            crime;
    private int age,
            sentence;
    private boolean solitary;

    /**
     * Prisoner constructor
     * @param name name of prisoner
     * @param crime crime he commited
     * @param age age he is
     * @param sentence how long he is sentence
     * @param solitary solitary confinement or not
     */
    public Prisoner(String name, String crime, int age, int sentence, boolean solitary) {
        this.name = name;
        this.crime = crime;
        this.age = age;
        this.sentence = sentence;
        this.solitary = solitary;
    }

    public String getName() {
        return name;
    }

    public String getCrime() {
        return crime;
    }

    public int getAge() {
        return age;
    }

    public int getSentence() {
        return sentence;
    }

    public boolean isSolitary() {
        return solitary;
    }

    @Override
    public String toString() {
        return name;
    }
}

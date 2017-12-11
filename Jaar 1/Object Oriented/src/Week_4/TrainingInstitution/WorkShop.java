package Week_4.TrainingInstitution;

public class WorkShop extends Course {
    private int numOfDays;

    public WorkShop(String name, int price, int numOfDays) {
        super(name, price);
        this.numOfDays = numOfDays;
    }

    @Override
    public String toString() {
        return super.toString()+", number of days: " + numOfDays;
    }
}

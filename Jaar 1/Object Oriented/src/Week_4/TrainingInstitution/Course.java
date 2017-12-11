package Week_4.TrainingInstitution;

public class Course {
    private String name;
    private int price;

    public Course(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Training: "+name +", price: "+price;
    }
}

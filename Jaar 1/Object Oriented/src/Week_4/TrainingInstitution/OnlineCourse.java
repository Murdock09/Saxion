package Week_4.TrainingInstitution;

public class OnlineCourse extends Course {
    private String url;

    public OnlineCourse(String name, int price, String url) {
        super(name, price);
        this.url = url;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + url;
    }
}

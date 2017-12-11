package Week_4.TrainingInstitution;

public class Registration {
    private Student student;
    private Course course;
    private String date;

    Registration(Student student, Course course, String date) {
        this.student = student;
        this.course = course;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Registration: " +
                "\r\n\t" + student +
                "\r\n\t" + course +
                "\r\n\tStarting from " + date;
    }
}

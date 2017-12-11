package Week_4.TrainingInstitution;

public class Student {
    private int studNum;
    private String name;
    private String adress;

    Student(int studNum, String name, String adress) {
        this.studNum = studNum;
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Student: Student nr " + studNum + ": " + name + ", address: " + adress;
    }
}

package Week_4.TrainingInstitution;

import java.util.ArrayList;
import java.util.HashMap;

public class Institute {
    private ArrayList<Registration> registrations = new ArrayList<>();
    private HashMap<String, Course> courses = new HashMap<>();
    private HashMap<Integer, Student> students = new HashMap<>();

    public Institute() {
    }

    void addOnlineCourse(String course, int price, String url) {
        OnlineCourse onlineCourse = new OnlineCourse(course, price, url);
        courses.put(course, onlineCourse);
    }

    void addWorkshop(String course, int price, int numOfDays) {
        WorkShop workShop = new WorkShop(course, price, numOfDays);
        courses.put(course, workShop);
    }

    void addStudent(int id, String name, String address) {
        Student student = new Student(id, name, address);
        students.put(id, student);
    }

    void signup(int id, String courseName, String date) {
        Student student = students.get(id);
        Course course = courses.get(courseName);
        Registration registration = new Registration(student, course, date);
        registrations.add(registration);
    }

    void printCursisten() {
        for (Registration r : registrations) {
            System.out.println(r);
        }
    }
}

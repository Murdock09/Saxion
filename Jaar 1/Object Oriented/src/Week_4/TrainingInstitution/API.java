package Week_4.TrainingInstitution;

public class API {
    public static void main(String[] args) {
        Institute inst = new Institute();
        inst.addOnlineCourse("Java", 4300, "http://java.it.nl");
        inst.addOnlineCourse("C#", 4200, "http://csharp.it.nl");
        inst.addWorkshop("Flower arranging", 1500, 3);
        inst.addWorkshop("Knitting", 1000, 2);

        inst.addStudent(1234, "Jan", "Kerkstraat 10, Losser");
        inst.addStudent(5678, "Anne", "Rozenstraat 93, Enschede");

        inst.signup(1234, "Java", "23 march 2016");
        inst.signup(1234, "Flower arranging", "5 april 2017");
        inst.signup(5678, "C#", "3 januari 2018");

        inst.printCursisten();
    }
}

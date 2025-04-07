package constructors;

public class Client {
    public static void main(String[] args) {
        //Student st = new Student();
        System.out.println("DEBUG");

        Student s2 = new Student("asa", 20, "asdas");

        Student copy = new Student(s2);
    }
}

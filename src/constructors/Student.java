package constructors;

public class Student {
    String name;
    int age;
    String batch;

    protected Student(String name1, int age1, String batch1) {
        System.out.println(name);
        name = name1;
        System.out.println(name);
        age = age1;
        batch = batch1;
    }

    Student(Student st) {
       name = st.name;
       age = st.age;
       batch = st.batch;
    }
}

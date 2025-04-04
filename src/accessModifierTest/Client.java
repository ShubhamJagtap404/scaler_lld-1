package accessModifierTest;

import accessModifers.Student;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Dyanand";
        // st1.age = 20; ---> doesnt; work
       // st1.batch = "Asdas"; ---> Doesn't work
        // st1.phone = "12312312";
    }
}

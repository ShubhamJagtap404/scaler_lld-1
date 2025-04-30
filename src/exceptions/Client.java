package exceptions;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws ItemNotFoundException {
        Student student = new Student();
        student.doSomething4();
        // student.findAverage();

        System.out.println("Doing more work from  main");

        throw new ItemNotFoundException("item not found. Give another id");
    }
}

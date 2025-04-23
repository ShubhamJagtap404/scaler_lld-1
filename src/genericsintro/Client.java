package genericsintro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>();
        Pair.<String>doSomething("asdas");

        Student student = new Student();
        student.doSomething(1);

    }
}

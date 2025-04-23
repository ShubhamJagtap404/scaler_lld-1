package genericsexample3;

import genericsintro.Pair;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();

        Test<Dog> t = new Test<>();
        t.doSomething(dogs);

        List<String> strings = new ArrayList<>();
        // ListPrinter.printList(strings);

        List l = new ArrayList();
        l.add(1);
        l.add("abc");

        Pair p = new Pair();
        p.setFirst("asdas");
        p.setFirst("asdas");
    }
}

package genericsexample3;

import java.util.List;

public class Test<T extends Animal> {
    public void doSomething(List<T> animals) {

    }

    public static <K extends Animal> void doSomething2(List<K> animals) {

    }
}

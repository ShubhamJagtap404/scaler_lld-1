package genericsintro;

public class Pair<T, V> {
    private T first;
    private V second;

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public static <K> void doSomething(K val) {
        System.out.println(val);
    }
}

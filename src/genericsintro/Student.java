package genericsintro;

public class Student {
    String name;
    String phone;
    double psp;

    public <T> void doSomething(T val) {
        T test = val;
        System.out.println(test);
    }
}

package polymorphism;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething();

        A a1 = new C();

        //.....Lots of code

        a1 = new B();
        a1.doSomething();
       // a1.run();

        a1.runA();
    }
}

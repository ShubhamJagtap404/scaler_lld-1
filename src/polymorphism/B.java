package polymorphism;

public class B extends A {

    // Overriding A
    public void doSomething() {
        System.out.println("Printing from B");
    }

    public void run() {
        System.out.println("Running from B");
    }
}


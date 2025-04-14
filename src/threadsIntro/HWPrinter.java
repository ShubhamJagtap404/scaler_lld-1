package threadsIntro;

public class HWPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing hello world from thread: " +
                Thread.currentThread().getName());

    }
}

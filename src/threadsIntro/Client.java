package threadsIntro;

public class Client {
    public static void main(String[] args) {
        System.out.println("Printing from main, thread name = " +
                Thread.currentThread().getName());

        HWPrinter hwPrinter = new HWPrinter();
        Thread t = new Thread(hwPrinter);

        t.start();

        System.out.println("Printing from main, thread name = " +
                Thread.currentThread().getName());

    }
}

package syncBlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();


        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread adderThread = new Thread(adder);
        Thread subThread = new Thread(subtractor);

        adderThread.start();
        subThread.start();

        adderThread.join();
        subThread.join();

        System.out.println(count.val);
    }
}

package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Queue<Object> store = new ConcurrentLinkedQueue<>();
        Semaphore producer = new Semaphore(6);
        Semaphore consumer = new Semaphore(0);

        Producer p1 = new Producer(store, producer, consumer);
        Producer p2 = new Producer(store, producer, consumer);
        Producer p3 = new Producer(store, producer, consumer);

        Consumer c1 = new Consumer(store, producer, consumer);
        Consumer c2 = new Consumer(store, producer, consumer);
        Consumer c3 = new Consumer(store, producer, consumer);
        Consumer c4 = new Consumer(store, producer, consumer);

        Thread pt1 = new Thread(p1);
        Thread pt2 = new Thread(p2);
        Thread pt3 = new Thread(p3);

        Thread ct1 = new Thread(c1);
        Thread ct2 = new Thread(c2);
        Thread ct3 = new Thread(c3);
        Thread ct4 = new Thread(c4);

        pt1.start();
        pt2.start();
        pt3.start();

        ct1.start();
        ct2.start();
        ct3.start();
        ct4.start();

//        pt1.join();
//        pt2.join();
//        pt3.join();
//
//        ct1.join();
//        ct2.join();
//        ct3.join();
//        ct4.join();

    }
}

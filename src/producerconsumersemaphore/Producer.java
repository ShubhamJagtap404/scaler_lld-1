package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Queue<Object> store;
    private int MAX_SIZE = 6;
    private Semaphore producer;
    private Semaphore consumer;

    public Producer(Queue<Object> store, Semaphore producer, Semaphore consumer) {
        this.store = store;
        this.producer = producer;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        try {
            while(true) {
                producer.acquire();
                    System.out.println("Producing");
                    store.add(new Object());
                consumer.release();
            }
        } catch (Exception e) {
            System.out.println("some problem occurred");
        }

    }
}

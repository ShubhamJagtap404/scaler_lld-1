package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Object> store;
    private int MAX_SIZE = 6;
    private Semaphore producer;
    private Semaphore consumer;

    public Consumer(Queue<Object> store, Semaphore producer, Semaphore consumer) {
        this.store = store;
        this.producer = producer;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        try {
            while(true) {
                consumer.acquire();
                    System.out.println("Consuming");
                    store.remove();
                producer.release();
            }
        } catch(Exception e) {
            System.out.println("Something went wrong");
        }

    }
}

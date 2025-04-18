package producerconsumerintro;

import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Object> store;
    private int MAX_SIZE = 6;

    public Consumer(Queue<Object> store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (store) {
                if(store.size() > 0) {
                    System.out.println("Consuming");
                    store.remove();
                }
            }
        }
    }
}

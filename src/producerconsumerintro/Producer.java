package producerconsumerintro;

import java.util.Queue;

public class Producer implements Runnable{
    private Queue<Object> store;
    private int MAX_SIZE = 6;

    public Producer(Queue<Object> store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (store) {
                if(store.size() < MAX_SIZE) {
                    System.out.println("Producing");
                    store.add(new Object());
                }
            }
        }
    }
}

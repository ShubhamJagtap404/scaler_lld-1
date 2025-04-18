package syncBlock;


import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count count;
    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 1; i < 10000; i++) {
            synchronized (count) { //lock.lock()
                System.out.println("Inside sub");
                count.val -= i;
            } // lock.unlock()
        }
    }
}

package syncMethods;

public class Count {
    private int val = 0;

    public synchronized void incrVal(int x) {
        val += x;
    }

//    public synchronized void decVal(int x) {
//        val -= x;
//    }

    public int getVal() {
        return val;
    }
}

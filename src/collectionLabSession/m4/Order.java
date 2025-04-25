package collectionLabSession.m4;

public class Order implements Comparable<Order> {
    private String orderId;
    private boolean isExpress;

    public Order(String orderId, boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public int compareTo(Order o) {
        if(this.isExpress == o.isExpress) {
            return this.orderId.compareTo(o.orderId);
        } else if (this.isExpress) {
            return -1;
        } else if(o.isExpress) {
            return 1;
        } else {
            return this.orderId.compareTo(o.orderId);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", isExpress=" + isExpress +
                '}';
    }
}
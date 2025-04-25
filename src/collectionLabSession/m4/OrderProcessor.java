package collectionLabSession.m4;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessor {
    private Queue<Order> orders;

    public OrderProcessor() {
        orders = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        orders.offer(order);
    }

    public Order processOrder() {
        return orders.poll();
    }

    public int getSize(){
        return orders.size();
    }
}
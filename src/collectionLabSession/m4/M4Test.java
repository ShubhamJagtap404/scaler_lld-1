package collectionLabSession.m4;

public class M4Test {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addOrder(new Order("1", true));
        orderProcessor.addOrder(new Order("2", false));
        orderProcessor.addOrder(new Order("3", false));

        for(int i = 0; i < 3; i++) {
            System.out.println(orderProcessor.processOrder());
        }
    }
}

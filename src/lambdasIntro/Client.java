package lambdasIntro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        /*
        * Anonymous implementation of Single Abstract Method
        * */

        Thread thread = new Thread(() -> {
            System.out.println("Hello world from " + Thread.currentThread().getName());
        });

        thread.start();

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(3);


        Collections.sort(list, (Integer i1, Integer i2) -> {
           return i1 - i2;
        });

        Collections.sort(list, (Integer i1, Integer i2) -> i1 - i2);


        Collections.sort(list, (i1, i2) -> i1 - i2);


        System.out.println(list);

        // MathOps addOps = new AddOps();
        MathOps addOps =  (int a, int b) -> {
            return a + b;
        };

        int addRes = addOps.calculate(1, 2);
        System.out.println(addRes);

        printSum(addOps, 1, 2);

        getSum(addOps, 2, 3);
    }

    public static void printSum(MathOps mathOps, int a, int b) {
        System.out.println(mathOps.calculate(a, b));
    }

    public static void getSum(MathOps mathOps, int a, int b) {
        System.out.println(mathOps.calculate(a, b));
    }
}

// H/w:
// Read about method references

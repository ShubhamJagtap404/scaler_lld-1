package genericsexample3;

import java.util.List;

public class ListPrinter {
    public static  void printList(List<? extends Animal> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

// HW
// Read about "super" keyword with wildcard generics

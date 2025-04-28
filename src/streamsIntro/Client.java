package streamsIntro;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,1,5,3,4,6,7,8);
        example8(list);
    }

    public static void example1(List<Integer> list) {
        // Print a list of integers using streams
        list.stream().forEach((element) -> {
            System.out.print(element + " ");
        });
    }

    public static void example2(List<Integer> list) {
        // Print sq of each number
        list.stream()
                .map((ele) -> {
            return ele * ele;
        })
                .forEach((ele) -> {
            System.out.println(ele);
        });
    }

    public static void example3(List<Integer> list) {
        // Print the sqaures of only even numbers
        list.stream()
                .filter((ele) -> ele % 2 == 0)
                .map((ele) ->  ele * ele)
                .forEach((ele) -> {
                    System.out.println(ele);
                });
    }

    public static void example4(List<Integer> list) {
        Stream<Integer> stream = list.stream();

        stream.map((ele) -> {
            return ele * ele;
        }).forEach((ele) -> {
            System.out.println(ele);
        });

        System.out.println(list);

        Stream<Integer> stream1 = list.stream();
        stream1.forEach((ele) -> {
            System.out.println(ele);
        });

    }

    public static void example5(List<Integer> list) {
        // find the sum of all the numbers in the stream
        int sum1 = list.stream()
                .reduce(0, (sum, ele) -> {
                    return sum + ele;
                });

        System.out.println(sum1);

    }

    public static void example6(List<Integer> list) {
        // Sort the list

        List<Integer> sortedList = list.stream().sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }

    public static void example7(List<Integer> list) {
        Optional<Integer> firstEle = list.stream()
                .map((ele) -> {
                    System.out.println("Calling map");
                    return ele * ele;
                }).findFirst();

        System.out.println(firstEle.get());
    }

    public static void example8(List<Integer> list) {
        list.stream()
                .map((ele) -> {
                    System.out.println("Calling map");
                    return ele * ele;
                });
    }


}


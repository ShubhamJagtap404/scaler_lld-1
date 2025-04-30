package genericsLabSession;

import collectionLabSession.m1.Book;
import collectionLabSession.m2.Inventory;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        Inventory<Book> inventory = new Inventory<>();
        inventory.add(new Book("1", "HP", 400.50, 5, "Rowling"));
        inventory.add(new Book("2", "LOTR", 200.50, 10, "Tolkien"));
        inventory.add(new Book("3", "Mistorn", 500.50, 7, "Sanderson"));
        inventory.add(new Book("4", "Foundation", 450.50, 3, "Asimov"));
        inventory.add(new Book("5", "BoSAS", 450.50, 3, "Collins"));
        inventory.add(new Book("6", "Hobbit", 350.50, 12, "Tokien"));

        q6(inventory.getAll());
    }

    public static void q1(List<Book> books) {
       // Print all items IDs in the inventory
        books.stream()
                .map(item -> item.getId())
                .forEach(id -> System.out.print(id + " "));
    }

    public static void q2(List<Book> books) {
        // Store the names of all the books in lowercase in a list

        List<String> bookNames = books.stream()
                .map(item -> item.getName().toLowerCase())
                .collect(Collectors.toList());

        System.out.println(bookNames);

    }

    public static void q3(List<Book> books) {
        // Generate a list of the lengths of item names and store in a list
    }

    public static void q4(List<Book> books) {
        // Find all items priced above 1000 and store in a list
        List<Book> bookList = books.stream()
                .filter(item -> item.getPrice() > 400)
                .collect(Collectors.toList());

        System.out.println(bookList);
    }

    public static void q5(List<Book> books) {
        // Check if any inventory item has a quantity of zero
        // Try to do without manually checking each item
        boolean res = books.stream().anyMatch(item -> item.getQuantity() == 0);
        System.out.println(res);
    }

    public static void q6(List<Book> books) {
        // Verify that all items have a price greater than 0
        boolean res = books.stream().allMatch(item -> item.getPrice() > 0);
        System.out.println(res);
    }

    public static void q7(List<Book> books) {
        // Confirm that no item has a negative quantity
        // Hint: use noneMatch
    }

    public static void q8(List<Book> books) {
        /*
        * Perform the following in a single stream pipeline:
        * - Filter items with price > 1000 and quantity > 0.
        * - Extract item names.
        * - Remove duplicates.
        * - Sort names alphabetically.
        * - Limit to top 5 results.
        * - Collect into a list and print.
        * */

        List<String> ans = books.stream()
                .filter(item -> item.getPrice() > 500 && item.getQuantity() > 0)
                .map(item -> item.getName())
                .distinct()
                .sorted()
                .limit(5)
                .collect(Collectors.toList());
    }

    public static void q9(List<Book> books) {
        // Calculate the total quantity of all items in the inventory
        int total = books.stream()
                .map(item -> item.getQuantity())
                .reduce(0, (totalSum, quantity) -> {
                    return totalSum + quantity;
                });
    }

    public static void q10(List<Book> books) {
        // Find the most expensive item using reduce
        books.stream()
                .reduce((item1, item2) -> {
                    return item1.getPrice() > item2.getPrice()? item1 : item2;
                });
    }

    public static void q11(List<Book> books) {
        // Concatenate all item names into a comma-separated string using reduce
        books.stream()
                .map(item -> item.getName())
                .reduce("", (concatenatedString, name) -> {
                   return concatenatedString + ", " + name;
                });
    }

}

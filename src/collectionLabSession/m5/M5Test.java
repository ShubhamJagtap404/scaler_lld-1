package collectionLabSession.m5;

import collectionLabSession.m1.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M5Test {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("1", "HP", 100.5, 5, "Rowling"));
        books.add(new Book("2", "HP2", 200.5, 3, "Rowling"));
        books.add(new Book("1", "HP3", 50.5, 7, "Rowling"));

        Collections.sort(books, new ItemQuantityComparator());
        System.out.println(books);
    }
}

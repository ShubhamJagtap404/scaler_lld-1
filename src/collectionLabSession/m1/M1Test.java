package collectionLabSession.m1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M1Test {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("1", "Harry Potter", 400.5, 5, "Rowling"));
        books.add(new Book("2", "LOTR", 200.5, 10, "Tolkien"));
        books.add(new Book("3", "ASOIAF", 300.5, 6, "Martin"));

        Collections.sort(books);


        System.out.println(books);
    }
}

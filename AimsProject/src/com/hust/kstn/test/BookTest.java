package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.Book.BookAuthor;
import java.util.ArrayList;
import java.util.List;

public class BookTest {

    public static void main(String[] args) {

        BookAuthor author1 = new BookAuthor("Author One", 1980, "Biography of Author One.");
        BookAuthor author2 = new BookAuthor("Author Two", 1992, "Biography of Author Two.");


        Book book1 = new Book(
                "The First Book",
                "Fiction",
                25.50,
                50000,
                author1
        );

        System.out.println("--- TESTING BOOK 1 (VARARGS CONSTRUCTOR) ---");
        System.out.println(book1);
        System.out.println();


        List<BookAuthor> authorsForBook2 = new ArrayList<>();
        authorsForBook2.add(author1);
        authorsForBook2.add(author2);

        Book book2 = new Book(
                "The Second Book",
                "Non-Fiction",
                35.75,
                75000,
                authorsForBook2
        );

        System.out.println("--- TESTING BOOK 2 (LIST CONSTRUCTOR) ---");
        System.out.println(book2);
        System.out.println();


        Book book3 = new Book(
                "A Book with Two Authors",
                "Science",
                40.00,
                120000,
                author1, author2
        );

        System.out.println("--- TESTING BOOK 3 (VARARGS WITH 2 AUTHORS) ---");
        System.out.println(book3);
    }
}
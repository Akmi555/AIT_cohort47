package lesson_34.sorted;
/*
@date 01.07.2024
@author Sergey Bugaienko
*/

import lists.MagicList;
import lists.MyList;

import java.util.Arrays;
import java.util.Comparator;

public class SortBooksApp {

    static MyList<Book> books = new MagicList<>();

    public static void main(String[] args) {


        books.add(new Book("Stefan", "Java for beginners"));
        books.add(new Book("Alpha", "Test title"));
        books.add(new Book("Circle", "Title for book"));
        books.add(new Book("Wine", "Wine in progress"));

        System.out.println(books);

        System.out.println(getSortedList());


    }

    public static MyList<Book> getSortedList() {
        Book[] array = books.toArray();

        Arrays.sort(array, Comparator.comparing(Book::getTitle));
        MyList<Book> result = new MagicList<>(array);
        return result;
    }
}

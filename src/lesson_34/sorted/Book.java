package lesson_34.sorted;
/*
@date 01.07.2024
@author Sergey Bugaienko
*/

import java.util.concurrent.atomic.AtomicInteger;

public class Book {
    private final int id;
    private String title;
    private String author;
    private AtomicInteger atomicInteger = new AtomicInteger(1);

    public Book(String title, String author) {
        this.id = atomicInteger.getAndIncrement();
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

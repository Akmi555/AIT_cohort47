package lesson_22.prinables;
/*
@date 13.06.2024
@author Sergey Bugaienko
*/

public class Book implements Printable {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    @Override
    public void print() {
        System.out.printf("Book %s (%s)\n", title, author);

    }




}

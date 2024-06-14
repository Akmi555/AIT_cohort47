package lesson_22.prinables;
/*
@date 13.06.2024
@author Sergey Bugaienko
*/

public class Journal implements Printable {
    String name;
    int number;

    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Journal: " + name + " #" + number);
    }

    @Override
    public void test() {
        System.out.println("Journal test overload");
    }
}

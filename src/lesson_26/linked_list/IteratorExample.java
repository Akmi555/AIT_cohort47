package lesson_26.linked_list;
/*
@date 19.06.2024
@author Sergey Bugaienko
*/

import lists.MyLinkedList;

import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        MyLinkedList<String> strings = new MyLinkedList<>();
        strings.addAll("Java", "Hello", "Cat", "Orange", "Banana");

        strings.addFirst("Python");

        System.out.println(strings);

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        // Синтаксический сахар
        // Цикл for-each "под капотом" использует Iterator
        // Работает такой цикл только с коллекциями, которые реализовали интерфейс Iterable

        for (String value : strings) {
            System.out.println(value);
        }


    }
}

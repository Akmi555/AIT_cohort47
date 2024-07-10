package lesson_41;
/*
@date 10.07.2024
@author Sergey Bugaienko
*/

import lesson_40.Cat;

import java.util.List;
import java.util.stream.Collectors;

public class DataFilters {

    // Фильтрация данных

    /*
    filter(Predicate<? superT> predicate) - возвращает поток,
    содержащий только те элементы, для которых предикат вернул true

    distinct() - удаляет дублирующиеся элементы. Возвращает поток с уникальными элементами
    Сравниваем объекты методом equals().

    limit(long maxSize) - ограничивает количество элементов потока заданным значением
    skip(long n) - пропускает первые n элементов

    takeWhile(Predicate<T> predicate) - возвращает новый поток, который содержит элементы исходного потока
    Элементы берутся до тех пор, пока предикат возвращает true.
    Как только предикат вернет false, копирование элементов прекращается. Все последующие элементы игнорируются

    dropWhile(Predicate<T> predicate) - он пропускает элементы исходного потока, пока предикат возвращает true
    и возвращает поток из ВСЕХ элементов, начиная с элемента, для которого предикат вернул false


     */

    public static void main(String[] args) {
//        task();
//        task1();
        task2();
    }

    private static void task2() {
        List<String> strings = List.of("aa", "bb", "ccc", "dd", "eee");

        List<String> strings1 = strings.stream()
                .takeWhile(str -> str.length() < 3)
                .collect(Collectors.toList());
        System.out.println("takeWhile: " + strings1);

        List<String> strings2 = strings.stream()
                .dropWhile(s -> s.length() < 3)
                .collect(Collectors.toList());
        System.out.println("dropWhile: " + strings2);
    }

    private static void task1() {
        // Получить три самых маленьких числа из списка
        List<Integer> integers = List.of(0, 5, 1, 4, 4, 3, 6, 66, 44);
        integers = List.of(10, 5);

        List<Integer> smallest = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("smallest: " + smallest);

        // Получить список чисел, отбросив 2 самых маленьких
        List<Integer> integerList = integers.stream()
                .sorted()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println("withoutSmallest: " + integerList);


    }

    private static void task() {
        // получить список уникальных элементов
        List<Integer> integers = List.of(0, 5, 1, 2, 4, 3, 4, 3, 6, 0, 1);

        integers.stream()
                .distinct()
                .sorted()
                .forEach( i -> System.out.print(i + "; ") );
        System.out.println();

        List<Cat> cats = List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Bear", 5, "braun"),
                new Cat("Tiger", 3, "gray"),
                new Cat("Panda", 4, "black")
        );


        List<Cat> catList = cats.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(catList);

        List<String> strings = List.of("abc", new String("abc"), "defg", "defg");
        System.out.println(strings.stream().distinct().collect(Collectors.toList()));

        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "abc";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));

    }
}

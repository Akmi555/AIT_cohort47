package lesson_41;
/*
@date 10.07.2024
@author Sergey Bugaienko
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataChange {
    // Промежуточные методы для изменения типа данных

    /*
    Stream<R> map(Function<T, R> mapper) - преобразует элементы потока с помощью заданной функции

    flatMap(Function<T, R> mapper) - Преобразует каждый элемент потока
    в поток других объектов и затем "сглаживает / склеивает" все эти потоки в один

    mapToObj(IntFunction() mapper) - преобразует примитивный тип данных в ссылочный при помощи заданной функции

    boxed() - используется для преобразования протока примитивов (IntStream, LongStream, DoubleStream)
    в поток их соответствующих оберточных классов (Stream<Integer>, ...)

    //
    mapToInt()


     */
    public static void main(String[] args) {

//        task();
//        task1();
//        task2();

        task3();

    }

    private static void task3() {
        String[] strs = {"aaa", "bbbb", "cccc"};
        // массив int-ов, содержащий длинны всех строк

        List<Integer> integers = Arrays.stream(strs)
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(integers);

        int[] ints = Arrays.stream(strs)
                .mapToInt(String::length)
                .toArray();

        System.out.println(Arrays.toString(ints));


    }

    private static void task2() {
        // Преобразовать массив примитивов в коллекцию при помощи StreamAPI
        int[] ints = new int[]{1, 2, 3, 4, 5, 6};

        List<Integer> integers = Arrays.stream(ints)
                .boxed()
//                .mapToObj(i -> i)
//                .mapToObj(i -> Integer.valueOf(i))
                .collect(Collectors.toList());

        System.out.println(integers);
    }

    private static void task1() {
        String[] strings = {"ABC", "def", "qwerty", "XyZ"};
        // Получить список всех символов


        List<Character> characterList = Arrays.stream(strings)
                // метод chars позволяет получить поток int-ов из кодов символов строки
                .flatMapToInt(str -> str.chars())
                .peek(e -> System.out.print("e: " + e + ", "))
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("characterList: " + characterList);


//        Arrays.stream(strings)
//                .flatMapToInt(s1 -> s1.chars())
//                .peek( ch -> System.out.print(ch + "; "))
//                .map(i -> {
//                    Character ch = (char) i;
//                    return ch;
//                })
//                .forEach(i -> System.out.print(i + ", "));

    }

    private static void task() {
        // Получить список всех продуктов, представленных во всех магазинах
        Shop shop = new Shop("Shop1", List.of("Orange", "Banana", "Apple"));
        Shop shop1 = new Shop("Shop2", List.of("Lime", "Cherry", "Pineapple"));
        Shop shop2 = new Shop("Shop3", List.of("Grape", "Lemon", "Apple"));

        Shop[] shops = new Shop[]{shop, shop1, shop2};

        List<String> products = Arrays.stream(shops)
                .flatMap(shopCurrent -> shopCurrent.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(products);


    }
}

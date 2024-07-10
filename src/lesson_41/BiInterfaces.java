package lesson_41;
/*
@date 10.07.2024
@author Sergey Bugaienko
*/

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiInterfaces {
    public static void main(String[] args) {

        // void BiConsumer<T, U> - принимает два аргумента. Ничего не возвращает
//        Выполняет операцию над двумя объектами типа Т и U

        BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1 + " : " + str2);
        biConsumer.accept("Hello", "Java");

        // boolean BiPredicate<T, U> - Проверка объектов на соответствие условию. Возвращает boolean
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a + 5 > b;
        System.out.println("te.test(10, 20): " + biPredicate.test(10, 20));

        // R BiFunction<T, U, R> - принимает два аргумента типов T и U, возвращает объект типа R
        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();
        System.out.println(biFunction.apply("One", "Two"));



    }
}

package homework_27;
/*
@date 21.06.2024
@author Sergey Bugaienko
*/

import lists.MagicList;

import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        MagicList<Integer> integers = new MagicList<>();
        integers.addAll(1, 2, 3, 4, 100, 200);

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);

        }

        System.out.println("\n ================ \n");

        for (Integer value : integers) {
            System.out.println(value);
            if (value == 4) {
                // При переборе значений итератором - удаление элемента из коллекций может привести к ошибке - аварийному завершению программы
//                integers.remove(value);
            }
        }

        System.out.println(integers);

    }
}

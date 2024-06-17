package homework_23.list;
/*
@date 17.06.2024
@author Sergey Bugaienko
*/

import java.util.Arrays;

public class ListApp {
    public static void main(String[] args) {
        MagicList<Integer> integerList = new MagicList<>();

        integerList.add(100);
        System.out.println(integerList);

        integerList.addAll(200, 300, 400, 500, 20, 30, 40, 99, 101, 150);
        System.out.println(integerList);

        System.out.println(integerList.size());

        Integer value = integerList.get(5);
        System.out.println(value);

        integerList.set(5, -500);
        System.out.println(integerList);

        System.out.println("integerList.indexOf(1000): " + integerList.indexOf(1000));
        System.out.println("integerList.indexOf(500): " + integerList.indexOf(500));

        integerList.add(500);
        System.out.println(integerList);
        System.out.println("integerList.lastIndexOf(500): " + integerList.lastIndexOf(500));

        Integer[] integers = integerList.toArray();

        System.out.println("Arrays.toString: " + Arrays.toString(integers));

        System.out.println("\n========================\n");

        MagicList<String> strings = new MagicList<>();

        System.out.println(strings);
        strings.add("Hello");

        String[] stringsArray = strings.toArray();
        System.out.println(Arrays.toString(stringsArray));

        System.out.println("\n ==================== \n");

        //Удалить по значению

        //Метод удаляет по индексу (т.к. 500 воспринимается как int тип)
        System.out.println(integerList.remove(500));

        // Явная упаковка int в Integer
        System.out.println(integerList.remove(Integer.valueOf(500)));

        MagicList<String> stringsList = new MagicList<>(new String[]{"Hello", "Java", "Python", "JS"});

        System.out.println(stringsList);

        stringsList.set(2, "Orange");
        System.out.println(stringsList);

        System.out.println(stringsList.indexOf("Java"));
        System.out.println("stringsList.contains('hello'): " + stringsList.contains("hello"));
        System.out.println("stringsList.contains('Hello'): " + stringsList.contains("Hello"));

        String valueSrt = stringsList.get(3);
        System.out.println(valueSrt);

        System.out.println(stringsList.remove(3));
        System.out.println(stringsList.remove("Hello"));
        System.out.println(stringsList);

        System.out.println(stringsList.isEmpty());
        System.out.println(stringsList.size());

        String[] arrayStr = stringsList.toArray();
        System.out.println("arrayStr.length: " + arrayStr.length);

        stringsList.addAll("Tree", "Red", "Dog", "Animal");
        System.out.println(stringsList);


    }
}

package lesson_28;
/*
@date 21.06.2024
@author Sergey Bugaienko
*/

import lists.MyList;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        int[] ints = new int[]{9, 5, 1, 2, 3, 0, 4};
        String[] strings = {"Abbb", "Cccc", "Bbbb", "Zebra", "apple"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2023, 300);
        cars[5] = new Car("Ferrari", 2021, 250);

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars);

        System.out.println(Arrays.toString(cars));
        System.out.println("\n carSpeedComparator =============\n");
        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();

        Arrays.sort(cars, carSpeedComparator);

        System.out.println(Arrays.toString(cars));

        CarModelComparator carModelComparator = new CarModelComparator();
        Arrays.sort(cars, carModelComparator);

        System.out.println(Arrays.toString(cars));
        System.out.println("\n ===== Anonimus class ========== \n");

        Arrays.sort(cars, new Comparator<Car>() {
            // Сравнение машин по году выпуска в порядке возрастания, если год совпадает - сравнить такие машины по модели в порядке убывания
            @Override
            public int compare(Car car1, Car car2) {
//                int yearCompare = car1.getYear() - car2.getYear();
                int yearCompare = Integer.compare(car1.getYear(), car2.getYear());

                if (yearCompare == 0) {
                    return car2.getModel().compareTo(car1.getModel());
                } else {
                    return yearCompare;
                }
            }
        });

        System.out.println(Arrays.toString(cars));

        //Функциональный интерфейс - это интерфейс с ровно одним абстрактным методом.

        // Лямбда-выражения

        Arrays.sort(cars, (car1, car2) -> {
            int yearCompare = Integer.compare(car1.getYear(), car2.getYear());

            if (yearCompare == 0) {
                return car2.getModel().compareTo(car1.getModel());
            } else {
                return yearCompare;
            }
        });

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, (c1, c2) -> {
            return c1.getYear() - c2.getYear();
        });

        Arrays.sort(cars, (c1, c2) -> c2.getYear() - c1.getYear());

        System.out.println(Arrays.toString(cars));

        System.out.println("\n ===========Comparator================ \n");

        Comparator<Car> byModel = Comparator.comparing(Car::getModel);

        Arrays.sort(cars, byModel);
        System.out.println(Arrays.toString(cars));

        // comparingInt, comparingLong, comparingDouble
        Comparator<Car> byYear = Comparator.comparingInt(Car::getYear);

        //naturalOrder, reverseOrder

        // Отсортировать машины по году выпуска в порядке убывания (в обратном порядке)
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()));
        // Альтернативная форма записи
        Arrays.sort(cars, Comparator.comparing(Car::getYear).reversed());

        System.out.println(Arrays.toString(cars));

        //Отсортировать по модели. Если модели "равны", то сортировать такие машины по убыванию года выпуска
        Arrays.sort(cars, Comparator.comparing(Car::getModel).thenComparing(Car::getYear, Comparator.reverseOrder()));

        System.out.println(Arrays.toString(cars));

        //Сортировка по году выпуска, если равны, то по модели в обратном порядке

        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel, Comparator.reverseOrder()));

        System.out.println(Arrays.toString(cars));

        // По году выпуска, если год совпадает - тогда отсортировать
        // в порядке убывания максимальной скорости

        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getMaxSpeed, Comparator.reverseOrder()));

        System.out.println(Arrays.toString(cars));


    }
}

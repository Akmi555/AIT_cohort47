package homework_28;
/*
@date 24.06.2024
@author Sergey Bugaienko
*/

import java.util.Comparator;

/*
Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Outpur
 */
public class Task1Comparator implements Comparator<Integer> {
    @Override
    public int compare(Integer int1, Integer int2) {
        boolean isFirstEven = int1 % 2 == 0;
        boolean isSecondEven = int2 % 2 == 0;

        String email = "test@email.com";
        email.replaceFirst("[a-z]4", "ABCD");

        if (isFirstEven && !isSecondEven) { // первое четное, второе не четное -> первое должно быть "меньше"
            return -1;
        } else if (!isFirstEven && isSecondEven) { //первое НЕ четное, второе четное -> второе должно быть "меньше"
            return 1;
        } else { // оба либо четных, либо не четных - сортируем в порядке возрастная
//            return int1 - int2;
            return Integer.compare(int1, int2);
        }

    }
}

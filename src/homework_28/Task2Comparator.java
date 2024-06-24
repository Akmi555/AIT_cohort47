package homework_28;
/*
@date 24.06.2024
@author Sergey Bugaienko
*/
/*
Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами в порядке возрастания.
Нечетные целые числа должны идти после четных в порядке убывания
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Outpur
 */

import java.util.Comparator;

public class Task2Comparator implements Comparator<Integer> {
    @Override
    public int compare(Integer int1, Integer int2) {
        boolean isFirstEven = int1 % 2 == 0;
        boolean isSecondEven = int2 % 2 == 0;

        if (isFirstEven && isSecondEven) { //оба четные. В порядке возрастания
            return  int1 - int2;
        } else if (isFirstEven) { //первое четное, а второе не четное -> первое должно быть "меньше"
            return -1;
        } else if (isSecondEven) { // первое нечет, второе Четное -> первое должно быть "больше"
            return 1;
        } else { // оба не четных - сортировать в порядке убывания
            return int2 - int1;
//            return Integer.compare(int2, int1); // альтернативное сравнение
        }

    }
}

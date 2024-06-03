package homework_13;
/*
@date 03.06.2024
@author Sergey Bugaienko
*/
/*
Найти второе по величине число в массиве
Напишите метод, который находит второе по величине число в массиве целых чисел.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 8, 5, 8, 3, 10, 9, 10};

        System.out.println("secondMax: " + secondMaxValue(array));
    }

    public static int secondMaxValue(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE; // минимальное число типа int
        }

        int max = array[0];
        int secondMax = array[0];

        for (int i = 0; i < array.length; i++) {
            int num = array[i];

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max){
                secondMax = num;
            }
        }

        System.out.println("max: " + max);

        return secondMax;

    }
}

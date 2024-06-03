package homework_13;
/*
@date 03.06.2024
@author Sergey Bugaienko
*/

/*
Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(sumArray(testArray));
    }


    public static int sumArray(int[] array) {
        if (array == null) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { // проверка на четность числа
                sum += array[i];
            }
        }
        return sum;

    }
}

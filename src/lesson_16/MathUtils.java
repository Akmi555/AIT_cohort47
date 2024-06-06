package lesson_16;
/*
@date 05.06.2024
@author Sergey Bugaienko
*/

public class MathUtils {

    

    public static int sumOfInts(int x, int... ints) {
        int sum = x;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }


        return sum;
    }

}

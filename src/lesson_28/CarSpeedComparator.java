package lesson_28;
/*
@date 21.06.2024
@author Sergey Bugaienko
*/

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getMaxSpeed() - car2.getMaxSpeed();
    }
}

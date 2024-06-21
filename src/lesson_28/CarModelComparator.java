package lesson_28;
/*
@date 21.06.2024
@author Sergey Bugaienko
*/

import java.util.Comparator;

public class CarModelComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getModel().compareTo(car2.getModel());
    }
}

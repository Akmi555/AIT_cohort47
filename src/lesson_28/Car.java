package lesson_28;
/*
@date 21.06.2024
@author Sergey Bugaienko
*/

public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private  int maxSpeed;


    public Car(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Car car) {
        return this.year - car.year;
    }
    /*
    a vs b
    a < b -> отрицательное значение
    a > b -> метод вернет положительное значение
    a == b -> метод вернет 0
     */

}

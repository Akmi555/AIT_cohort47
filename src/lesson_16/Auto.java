package lesson_16;
/*
@date 05.06.2024
@author Sergey Bugaienko
*/

public class Auto {
    static int counter;

    private String model;
    private int powerPS;

    public Auto(String model, int powerPS) {
        this.model = model;
        this.powerPS = powerPS;
        counter++;
    }

    public String toString() {
        return "Auto " + model + "; power: " + powerPS + ". Всего выпущено машин: " + Auto.counter;
    }
}

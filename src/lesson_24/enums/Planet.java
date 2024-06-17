package lesson_24.enums;
/*
@date 17.06.2024
@author Sergey Bugaienko
*/

public enum Planet {
    MERCURY(3.01943e+20, 2.4545e5),
    VENUS(5.5665e+25, 7.43454e6);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "{" +
                mass +
                " | " + radius +
                '}';
    }
}

package homework_21.shapes;
/*
@date 13.06.2024
@author Sergey Bugaienko
*/
/*
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.


Реализуйте классы-наследники Circle, Rectangle, и Triangle.

Убедитесь, что все классы правильно вычисляют площадь и периметр.

Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */

public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();

}

package lesson_22.prinables;
/*
@date 13.06.2024
@author Sergey Bugaienko
*/

public interface ColorPrintable extends Printable{

    void colorPrint();
    // Без строки 11 интерфейс получит дефолтную реализацию метода от Printable
    void test();
}

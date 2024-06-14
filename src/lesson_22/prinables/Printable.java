package lesson_22.prinables;
/*
@date 13.06.2024
@author Sergey Bugaienko
*/

public interface Printable {
    //Все интерфейсы косвенно абстрактны

    // Константа (public static final)
    // public static final
    double PI = 3.141519;


    // Все методы в интерфейсах косвенно публичны и абстракты
    // public abstract
    void print();

    // Начиная с JDK8 доступны методы по умолчанию (имеющие реализацию)
    default void test() {
        System.out.println("Test " + PI + " | " + getSomeString());
    }

    //Начиная c JDK 8 доступны статические методы в интерфейсах
    static void testStatic(String str) {
        System.out.println("Static test method " + str);
    }

    // JDK 9 доступны приватные методы.
    // Они НЕ могут быть переопределены или вызваны в классе
    private static String getSomeString() {
        return "Some string";
    }

}

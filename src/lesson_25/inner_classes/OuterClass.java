package lesson_25.inner_classes;
/*
@date 18.06.2024
@author Sergey Bugaienko
*/

public class OuterClass {
    private static int staticOuterField = 42;
    private int instanceOuterField = 25;

    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class");
            System.out.println("Static outer field " + staticOuterField);
            // System.out.println("Instance outer field " + instanceOuterField); Error - нет доступа к НЕ статике
        }
    }
}

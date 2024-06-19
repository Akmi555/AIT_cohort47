package lesson_25.inner_classes;
/*
@date 18.06.2024
@author Sergey Bugaienko
*/

public class OuterClass1 {
    private static int staticOuterField = 42;
    private int instanceOuterField = 25;

    class InnerClass {
        void display() {
            System.out.println("Inside inner class");
            System.out.println("Static outer field: " + staticOuterField);
            System.out.println("Instance outer field: " + instanceOuterField);
        }
    }
}

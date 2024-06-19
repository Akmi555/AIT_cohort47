package lesson_25.inner_classes;
/*
@date 18.06.2024
@author Sergey Bugaienko
*/

public class InnerExample {
    public static void main(String[] args) {

        /*
        1. Статические вложенные классы - nested classes
        2. Внутренние классы - inner classes
        3. Локальный внутренний класс
         */

        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();

        OuterClass1 outerObject = new OuterClass1();
        OuterClass1.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.display();

        OuterClass2 outerObject2 = new OuterClass2();
        outerObject2.myMethod();

    }
}

package lesson_25.inner_classes;
/*
@date 18.06.2024
@author Sergey Bugaienko
*/

public class OuterClass2 {

    void myMethod() {
        class LocalInnerClass {
            void display() {
                System.out.println("Inside local inner class");
            }
        }

        LocalInnerClass localInnerObject = new LocalInnerClass();
        localInnerObject.display();
    }
}

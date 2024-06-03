package lesson_14;
/*
@date 03.06.2024
@author Sergey Bugaienko
*/

public class MainDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Bim", 5);

        dog.printInfo();

        dog.run();
        dog.run();
        dog.run();
        dog.run();

        dog.printInfo();
    }
}

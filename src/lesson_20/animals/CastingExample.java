package lesson_20.animals;
/*
@date 11.06.2024
@author Sergey Bugaienko
*/

public class CastingExample {
    public static void main(String[] args) {

        Animal animal = new Hamster(); // здесь тип Hamster автоматически преобразуется к типу Animal

        animal.voice();

        Animal animal1 = new Dog();
        animal1.voice();//Восходящее преобразования

        Animal animal2 = new Cat();
        animal2.voice();


    }
}

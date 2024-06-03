package lesson_14;
/*
@date 03.06.2024
@author Sergey Bugaienko
*/

public class Dog {
    String name;
    int weight;


    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    void eat() {
        System.out.println("Я кушаю, ням-ням");
        weight++;
    }

    void run() {

        while (weight < 3) {
            System.out.println("Сорян! Я слишком худая и голодная. Бежать не могу!");
            System.out.println("Надо поесть! Мой вес сейчас: " + weight);

            eat();
        }

        System.out.println("Я бегу!");
        weight -= 2;
    }

    void printInfo() {
        System.out.println("I am dog " + this.name + ", my weight: " + weight);
    }
}

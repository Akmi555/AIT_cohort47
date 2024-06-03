package lesson_14;
/*
@date 03.06.2024
@author Sergey Bugaienko
*/

public class Cat {
    String name;
    String color;
    int age;

    public Cat() {
    }

    public Cat(String catName) {
        name = catName;
    }

    public Cat(String catName, String color) {
        name = catName;
        this.color = color;
        // Ключевое слово this - внутри класса используется для ссылки на текущий объект - экземпляр класса,
        // в контексте которого вызван метод или конструктор
    }

    public Cat(String name, String color, int age) {
        // Ключевое слово this также может быть использовано для вызова других конструкторов этого класса
        this(name, color); // вызывается конструктор, принимающий две Стринги
        // Будет создан объект, проинициализированны соответсвующее поля

        this.age = age;
    }

    void sleep() {
        System.out.println("Я сплю!");
    }

    void run() {
        System.out.println("Я бегу!");
    }

    void sayMeow() {
        System.out.println("Meow");
    }

    void whoAmI() {
        System.out.println("Я котик " + this.name + ", мой возраст: " + age + ", мой окрас: " + color);
    }
}

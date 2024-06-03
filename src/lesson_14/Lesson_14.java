package lesson_14;
/*
@date 03.06.2024
@author Sergey Bugaienko
*/

public class Lesson_14 {
    public static void main(String[] args) {

        Cat cat = new Cat(); // создание объекта класса Cat
        /*
        new Cat() - Вызов конструктора.
        При создание объекта класса все его поля инициализируются значениями по умолчанию
        Для числовых примитивных типов -> 0 / 0.0
        boolean -> false
        // для всех ссылочных типов - null
         */


        cat.sayMeow();
        cat.run();
        cat.sleep();

        String name = cat.name;
        System.out.println("Имя: " + name);
        cat.whoAmI();

        System.out.println("\n ====================== \n");

        Cat cat1 = new Cat("Max");
        // Был создан объект класса Cat
        // Строка, которая была передана в конструктор ("Max") была присвоена полю класса name
        // Было присвоено некое начальное значение полю (состояние)

        System.out.println("name: " + cat1.name);
        cat1.whoAmI();

        Cat cat2 = new Cat("Diamond", "red");

        System.out.println("cat2.name: " + cat2.name);
        System.out.println("cat2.color: " + cat2.color);

        System.out.println("\n============================\n");

        Cat cat3 = new Cat("Tom", "black", 2);
        cat3.whoAmI();

        Cat cat4 = cat3;

        cat4.whoAmI();

        cat3.age = 11;
        cat3.whoAmI();
        System.out.println("cat4.age: " + cat4.age);
        cat4.whoAmI();

        System.out.println("\n============new Cat4 =================");
        cat4 = new Cat("Bim", "white", 5);

        cat4.whoAmI();
        cat3.whoAmI();

        // cat3 = null; если раскомментировать - программа аварийно завершится
        cat3.whoAmI();

        System.out.println("End of program");




    }
}

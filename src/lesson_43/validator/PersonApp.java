package lesson_43.validator;
/*
@date 12.07.2024
@author Sergey Bugaienko
*/

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("john@email.com", "qwerty");
        System.out.println(person);

        System.out.println("\n ==================");

        Person person1 = new Person("john.email.com", "qwerty");
        System.out.println(person1);

        System.out.println("\n==================\n");
        Person person2 = new Person("john@ma%il.com", "qwerty");
        System.out.println(person2);
    }
}

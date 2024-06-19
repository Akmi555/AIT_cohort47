package lesson_26.persons;
/*
@date 19.06.2024
@author Sergey Bugaienko
*/

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("email", "password");

        System.out.println(person);
        System.out.println(person.getPassword());

    }
}

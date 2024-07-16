package homework_43.validator;
/*
@date 12.07.2024
@author Sergey Bugaienko
*/

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("john@email.com", "qwerty1Q!");
        System.out.println(person);
        System.out.println(person.getPassword());

        System.out.println("\n ==================");

        Person person1 = new Person("john.email.com", "qwerty1Q");
        System.out.println(person1);
        System.out.println(person1.getPassword());

        System.out.println("\n==================\n");
        Person person2 = new Person("john@ma%il.com", "qwertyQ%");
        System.out.println(person2);
        System.out.println(person2.getPassword());


        Person person3 = new Person("john@email.com", "qwerty1Q");
        System.out.println(person3);
        System.out.println(person3.getPassword());


        System.out.println("\n==================\n");
        Person person4 = new Person("john@mail.com", "qwertyQ%");
        System.out.println(person4);
        System.out.println(person4.getPassword());


        System.out.println("\n========================\n");
        Person person5 = new Person("john@email.com", "qwerty");
        System.out.println(person5);
        System.out.println(person5.getPassword());


    }
}

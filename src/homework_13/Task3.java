package homework_13;

import java.util.Scanner;

/*
@date 03.06.2024
@author Sergey Bugaienko
*/
/*
Подсчет гласных и согласных
Напишите программу, которая просит пользователя ввести слово и подсчитывает количество гласных и согласных букв в этом слове.


 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String input = scanner.nextLine();

        calculateCharacter(input);

        char a = 'а';
        char z = 'я';

        char A = 'А';
        char Z = 'Я';
        System.out.println((int) a);
        System.out.println((int) A);
        System.out.println((int) z);
        System.out.println((int) Z);




    }

    public static void calculateCharacter(String input) {
        int vowels = 0;
        int consonants = 0;



        String vowelsList = "AEIOUaeiou";
//        vowelsList = "аеиоуюя";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

//            if ((c >= 1040 && c <= 1072) || (c >= 1071 && c <= 1103)) {
//                System.out.println("Буква кириллицы: " + c);
//            }


            if (Character.isLetter(c)) { // проверка, что символ является буквой
                                        // можно реализовать через проверку десятичных кодов
                if (vowelsList.indexOf(c) == -1) {
                    consonants++;
                } else {
                    vowels++;
                }
            }
        }

        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);
    }
}

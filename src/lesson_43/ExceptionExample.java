package lesson_43;
/*
@date 12.07.2024
@author Sergey Bugaienko
*/

import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionExample {
    public static void main(String[] args) {

        // Ошибки компиляции
        // int a = "Java";

        // Ошибки Runtime

        // Exception (исключение)
        /*

        try {
            // код, который может вызвать исключение
        } catch (ExceptionType ex) {
            // код обработки исключения
        } catch (ExceptionType2 ex) {
            // код обработки другого типа ошибки
        } finally {
            // код, который выполнится независимо от того, было исключение перехвачено или нет.
        }

         */

        // System.out.println(1 / 0); //java.lang.ArithmeticException

        int[] array = {1, 23, 4};
//        array[10] = 10; //java.lang.ArrayIndexOutOfBoundsException

        try {
            array[10] = 10; //java.lang.ArrayIndexOutOfBoundsException
        } catch (Exception ex) {
            System.out.println("Что-то не так с индексом: " + ex.getMessage());
        }

        String str = null;
        // str.length(); // java.lang.NullPointerException

        System.out.println("\n ============== \n");
        System.out.println("First method");

        String url = getUrlString();
        System.out.println("Пытаемся открыть страницу: " + url);

        System.out.println("\n ========================== \n");

        String url2 = null;
        try {
            url2 = getUrlString2();
            System.out.println("End block try!");
        } catch (MalformedURLException e) {
            System.out.println("Неверный формат url");
            System.out.println(e.toString());
        } finally {
            System.out.println("Блок finally");
        }

        System.out.println("Пытаемся открыть вторую страницу: " + url2);


    }

    // Ключевое слово throws используется в сигнатуре метода для указания, что метод может выбросить исключение.
    private static String getUrlString2() throws MalformedURLException {
        URL myUrl = null;
        String defaultString = "https://google.com";

        myUrl = new URL(defaultString);
        myUrl = new URL("https://example.com");

        return myUrl.toString();
    }

    private static String getUrlString() {
        URL myUrl = null;
        String defaultString = "https://google.com";

        try {
            myUrl = new URL("hps://example.com");
            System.out.println("Next line code!");
        } catch (MalformedURLException exception) {
            System.out.println("Неверный формат URL: " + exception.getMessage());
        } finally {
            if (myUrl == null) {
                try {
                    myUrl = new URL(defaultString);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        }

        return myUrl.toString();
    }
}

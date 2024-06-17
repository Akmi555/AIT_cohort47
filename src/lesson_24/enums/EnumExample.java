package lesson_24.enums;
/*
@date 17.06.2024
@author Sergey Bugaienko
*/

public class EnumExample {

    public static void main(String[] args) {

        Day today = Day.MONDAY;
        System.out.println(today);

        switch (today) {
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case MONDAY:
                System.out.println("Понедельник");
                break;
            default:
                System.out.println("Какой-то другой день");
        }
    //Методы
        // Возвращает массив значений
        Day[] values = Day.values();

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        System.out.println("\n========================\n");

        // Получить строковое значение
        String dayStr = Day.MONDAY.toString();
        System.out.println(dayStr);

        // Возвращает константу Enum с указанным именем
        Day someDay = Day.valueOf("Monday".toUpperCase());
        System.out.println(someDay);

        // Сравнение Enum. Для сравнения двух значений Enum можно безопасно использовать оператор ==
        System.out.println(someDay == Day.MONDAY);

        // Возвращает порядковый номер константы (начиная с нуля)
        System.out.println(Day.THURSDAY.ordinal());

        Planet mercury = Planet.MERCURY;

        System.out.println(mercury);

        System.out.println("mercury.getMass(): " + mercury.getMass());
        System.out.println("mercury.getRadius(): " + mercury.getRadius());

        String mercuryStr = Planet.MERCURY.toString();
        System.out.println("mercuryStr: " + mercuryStr);

        mercuryStr = Planet.MERCURY.name();
        System.out.println("Planet.MERCURY.name(): " + Planet.MERCURY.name());







    }




}

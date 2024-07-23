package lesson_45;
/*
@date 16.07.2024
@author Sergey Bugaienko
*/

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTime {
    // Java Time API - java.time
    // Joda-Time

    public static void main(String[] args) {
        // LocalDate - представляет дату (год, месяц, день) без времени и часового пояса

        LocalDate date = LocalDate.now(); // возвращает текущую дату
        System.out.println("now: " + date);

        // прибавить 1 день к дате
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("tomorrow: " + tomorrow);
        System.out.println("plusWeeks: " + date.plusWeeks(4)); // плюс 4 недели к дате
        System.out.println("yesterday: " + date.minusDays(1)); // минус 1 день
        LocalDate date1 = LocalDate.of(2002, 2, 15); // Установить дату (год, месяц, число
        System.out.println("date1: " + date1);

        // Можно использовать Enum с названиями месяцев
        LocalDate date2 = LocalDate.of(2002, Month.FEBRUARY, 15);
        System.out.println(date2);

        System.out.println("год: " + date2.getYear() + "; месяц: " + date2.getMonth() + "; месяц-цифра: " + date2.getMonthValue());
        System.out.println("число: " + date2.getDayOfMonth() + "; день недели: " + date2.getDayOfWeek() + "; день года: " + date2.getDayOfYear());
        System.out.println("сколько дней в месяце: " + date2.lengthOfMonth() + "; дней в году: " + date2.lengthOfYear());

        String dateString = "2000-10-25";
        LocalDate date3 = LocalDate.parse(dateString);
        System.out.println(date3.getDayOfMonth() + ":" + date3.getMonthValue() + ":" + date3.getYear() + ":" + date3.getDayOfWeek());

        System.out.println("\n================= LocalTime ===============");
        //LocalTime - представляет время (часы, минуты, секунды, наносекунды)
        LocalTime time = LocalTime.now(); // возвращает текущее время
        System.out.println("LocalTime.now(): " + time);

        LocalTime time1 = LocalTime.of(21, 33);
        time1 = LocalTime.of(21, 33, 44);
        time1 = LocalTime.of(21, 33, 44, 54875);
        System.out.println(time1);

        System.out.println("time.plusHours(1): " + time.plusHours(1)); // добавляет 1 час к объекту времени
        System.out.println("time.plusMinutes(65): " + time.plusMinutes(65));
        System.out.println("time.minusSeconds(30): " + time.minusSeconds(30));

        System.out.println(time.getHour() + " | " + time.getMinute() + " | " + time.getSecond() + " | " + time.getNano());
        String timeStr = "12:13:45";
        LocalTime parseTime = LocalTime.parse(timeStr);
        // ожидает String в формате ISO-8601 ("2001-01-15T08:15:45+01:00")
        System.out.println(parseTime);

        System.out.println("\n ================= LocalDateTime ==============");
        // LocalDateTime - представляет дату и время без учета часового пояса
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.of(2011, Month.AUGUST, 15);
        LocalTime localTime = LocalTime.of(15, 31, 59);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime: " + dateTime);
        dateTime = LocalDateTime.of(2024, 12, 31, 23, 59);
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfWeek().getValue());
        System.out.println("dateTime.plusHours(1): " + dateTime.plusHours(1));
        System.out.println("dateTime.minusYears(1): " + dateTime.minusYears(1));

        System.out.println("\n ========== ZonedDateTime ==========");
        // ZonedDateTime - представляет дату и время с часовым поясом

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime + " | " + zonedDateTime.getZone());

        System.out.println("\n ========== isAfter, isBefore, until, equals ======");
        LocalDate date4 = LocalDate.of(2020, 10, 15);
        LocalDate date5 = LocalDate.of(2020, 6, 25);

        // isAfter, isBefore, until, equals есть у всех объектов, представляющий дату и/или время
        // isAfter - поверяет, что текущий объект после (позже) указанного объекта
        boolean isAfter = date4.isAfter(date5);
        System.out.println("date4.isAfter(date5): " + isAfter);

        // isBefore - поверяет, что текущий объект до (раньше) указанного объекта
        System.out.println("date4.isBefore(date5): " + date4.isBefore(date5));

        // equals - проверяем даты/время на равенство
        System.out.println("date4.equals(date5): " + date4.equals(date5));

        // until - метод измеряет время между текущим и указанным объектом даты/времени -> long
        long daysBetween = date4.until(date5, ChronoUnit.DAYS);
        System.out.println("daysBetween: " + daysBetween);
        System.out.println("date5.until(date4, ChronoUnit.MONTHS): " + date5.until(date4, ChronoUnit.MONTHS));

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.minusDays(15);
        System.out.println(dateTime2.until(dateTime1, ChronoUnit.SECONDS));

        LocalDateTime dateTime3 = dateTime1.minus(10, ChronoUnit.DAYS);
        LocalDateTime dateTime4 = dateTime1.plus(5, ChronoUnit.YEARS);
        System.out.println(dateTime3);
        System.out.println(dateTime4);

        long hoursBetween = ChronoUnit.HOURS.between(dateTime3, dateTime4);
        System.out.println("hoursBetween: " + hoursBetween);

        System.out.println(" =============== Duration, Instant ========= ");
        // Duration представляет продолжительность в секундах и наносекундах
        // Instant представляет одну точку на временной шкале в Григорианском календаре с точностью до наносекунды
        // 1 января 1970 по UTC

        Instant start = Instant.now();
        // Здесь какой-то код, время работы которого я хочу засечь
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < i; j++) {
                sum += j;
            }
        }
        System.out.println(sum);
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("duration: " + duration);
        long milis = duration.toMillis();
        long seconds = duration.toSeconds();
        System.out.println(milis + " | " + seconds);
        System.out.println(duration.getNano());

        System.out.println("\n ============ Period =============");
        // Period - представляет период времени в годах, месяцах и днях
        LocalDate startDate = LocalDate.of(2022, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.now();
        Period period = Period.between(startDate, endDate);
        System.out.println(period);
        System.out.println(period.getYears() + " | " + period.getMonths() + " | " + period.getDays());
        System.out.println("period.toTotalMonths(): " + period.toTotalMonths());
        System.out.println(period.get(ChronoUnit.DAYS));

        System.out.println("\n======== DateTimeFormatter ===============");
        // DateTimeFormatter форматирование даты и времени
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("formattedDate: " + formattedDate);

        /*
        y - год
        M - месяц
        d - день
        H - час в формате от 0 до 23
        h - час в формате от 0 до 12, флаг `a` для отображения AM/PM
        m - минута
        s - секунда

        Количество повторений символа определяет формат
        yy - двухзначный год, например `23` для 2023
        yyyy - 4-значный год
        M - месяц "2" или "12"
        MM - двухзначный месяц: "02" или "12"
        d - однозначный или двузначный день: "3" или "29"
        dd - двухзначный день: "03" или "29"

         */

        String dateForParse = "23-10-26 19:15";
        System.out.println("stringWithDate: " + dateForParse);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime parseDateTime = LocalDateTime.parse(dateForParse, formatter1);
        System.out.println(parseDateTime.getDayOfWeek() + " | " + parseDateTime.getHour());
        System.out.println(parseDateTime.format(formatter));

        System.out.println("\n ================= Task1 ============");

        // "15-12-2022 20-46"
        // запарсить  строку в формат LocalDateTime
        // распечатать отдельно месяц, день, час

        // "13-01-2023 00-47"
        // какому дню недели соответствует вторая дата
        // сколько дней между этим датами

        String dateStr1 = "15-12-2022 20-46";
        String dateStr2 = "13-01-2023 00-47";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime dateFromStr1 = LocalDateTime.parse(dateStr1, formatter2);
        LocalDateTime dateFromStr2 = LocalDateTime.parse(dateStr2, formatter2);
        System.out.println(dateFromStr1.getMonth() + " | " + dateFromStr1.getDayOfMonth() + " | " + dateFromStr1.getHour() );
        System.out.println(dateFromStr2.getDayOfWeek());
        System.out.println(dateFromStr2.getDayOfWeek().getValue());
        System.out.println(dateFromStr1.until(dateFromStr2, ChronoUnit.DAYS));


    }
}

package homework_44.transactions;
/*
@date 16.07.2024
@author Sergey Bugaienko
*/
/*
Дан файл с историей поступлений денег на счета пользователей за некий период времени:

user1:2050
user2:1200
user1:1700
user3:1800
user1:1300
user4:2100
user2:750

Данные в виде: <имяПользователя>:<суммаПоступления>.

Ваше задание прочитать данные из файла и обработать их.

Результат обработки должен быть записан в два файла:

less.txt список тех, кому в сумме перечисленно меньше 2000
more.txt список тех, кому в сумме перечисленно 2000 и больше
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    private static final int LIMIT = 2000;
    private static final File PATH = new File("src/homework_44/transactions");
    private static final String FILE_DATA = "data";
    private static final String FILE_LESS = "less.txt";
    private static final String FILE_MORE = "more.txt";


    public static void main(String[] args) {

        List<String> records = readData();
        System.out.println(records);

        Map<String, Integer> users = listToMap(records);
        System.out.println(users);
//
        writeFiles(users);
    }

    private static void writeFiles(Map<String, Integer> users) {
        try (BufferedWriter less = new BufferedWriter(new FileWriter(new File(PATH, FILE_LESS)));
             BufferedWriter more = new BufferedWriter(new FileWriter(new File(PATH, FILE_MORE)))
        ) {
            for (Map.Entry<String, Integer> entry : users.entrySet()) {

                String data = entry.getKey() + ":" + entry.getValue();

//                BufferedWriter writer1;
//                if (entry.getValue() < LIMIT) {
//                    writer1 = less;
//                } else {
//                    writer1 = more;
//                }

                BufferedWriter writer = entry.getValue() < LIMIT ? less : more;
                writer.write(data);
                writer.newLine();


//                if (entry.getValue() < LIMIT) {
//                    less.write(data);
//                    less.newLine();
//                } else {
//                    more.write(data);
//                    more.newLine();
//                }
            }

            System.out.println("Запись а файлы завершена");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static Map<String, Integer> listToMap(List<String> records) {
        Map<String, Integer> users = new HashMap<>();

        for (String record: records) {
            // user1:2050
            String[] data = record.split(":");

            String name = data[0];
            int amount = Integer.valueOf(data[1]);
            //                                  put(name, amount) : put(name, (value + amount))
            users.compute(name, (key, value) -> value == null ? amount : amount + value);
        }


        return users;
    }

    private static List<String> readData() {
        List<String> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(PATH, FILE_DATA)))) {

            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  result;
    }
}

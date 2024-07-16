package lesson_44;
/*
@date 15.07.2024
@author Sergey Bugaienko
*/

import java.io.*;

public class Task1 {
    public static void main(String[] args) {

        /*
        Выберите какую-то папку.
        Создайте в папке 10 файлов: test_1,txt, test_2.txt ... test_10.txt.
        В каждый файл запишите строку: Java1, Java2 ... Java10.
         */

        File path = new File("src/lesson_44/fileIO/testsIO");
        path.mkdirs();

        for (int i = 1; i < 11; i++) {
            File file = new File(path, "test_" + i + ".txt");

            try (FileWriter writer = new FileWriter(file)) {
                file.createNewFile();
                writer.write("Java" + i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        /*
        Проверьте все файлы в директории (получить список файлов, залезть в каждый, считать строку)
        Выведите имя файла, в котором содержится строка "Java7"
        // Output: test_7.txt
         */

        // Получим список файлов / директорий
        File[] files = path.listFiles();

        for (File file: files){
            // Код чтения из каждого файла и проверки строки.

            // Проверяем, что работаем с файлом, а не директорией
            if (file.isFile()) {

                // открываю поток буферизированного чтения из файлв
                try (FileReader fileReader = new FileReader(file);
                     BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                    // считываю строку из файла
                    String line = bufferedReader.readLine();

                    // Проверяю содержимое строки
                    if (line != null && line.contains("Java7")) {
                        System.out.println("Файл найден: " + file.getName());
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}

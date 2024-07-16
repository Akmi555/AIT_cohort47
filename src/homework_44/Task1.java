package homework_44;
/*
@date 16.07.2024
@author Sergey Bugaienko
*/

/*
Дан файл text.txt:

Lorem ipsum dolor sit amet, consectetur adipisicing.
Lorem ipsum dolor sit amet.
Lorem ipsum dolor sit amet, consectetur adipisicing elit.
Lorem, ipsum dolor.
Lorem ipsum dolor sit amet consectetur adipisicing elit. Officia.
Lorem, ipsum.
Lorem ipsum dolor sit amet consectetur adipisicing elit.
Lorem ipsum dolor sit.
Lorem ipsum dolor sit amet consectetur adipisicing elit. Nemo!

Ваша задача используя классы пакета java.io создать файл с именем 'copy.txt' и скопировать в него все данные из файла 'text.txt'
 */

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        File path = new File("src/homework_44");

        String inputFile = "text.txt";
        String copyFile = "copy.txt";

        // Создам поток для чтения из файла
        try (FileReader fileReader = new FileReader(new File(path, inputFile));
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             // Создам поток для записи
             FileWriter fileWriter = new FileWriter(new File(path, copyFile));
             BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {

            // Считываю строки из файла в цикле (пока есть строки). Записываю каждую строку в новый файл
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

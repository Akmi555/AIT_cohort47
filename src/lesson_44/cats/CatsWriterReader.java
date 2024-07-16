package lesson_44.cats;
/*
@date 15.07.2024
@author Sergey Bugaienko
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatsWriterReader {
    public static void main(String[] args) {

        List<Catty> cats = new ArrayList<>(List.of(
                new Catty("Cat", 9, true),
                new Catty("John", 2, true),
                new Catty("Maria", 7, false),
                new Catty("Boris", 4, true),
                new Catty("Hanna", 6, false),
                new Catty("Catty", 1, false)
        ));

        File path = new File("src/lesson_44/cats/files");
        path.mkdirs();
        File file = new File(path,"cats.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // записать список кошек в файл
        writeCatsToFile(cats, file);

        // считать из фала кошек и вернуть список
        List<Catty> newCats = readCatsFromFile(file);
//
        newCats.forEach(System.out::println);

    }

    private static List<Catty> readCatsFromFile(File file) {
        List<Catty> cats = new ArrayList<>();

        try (FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            // Будет считывать в цикле строки из файла. Каждую строку записывать в переменную line, пока строки в файле есть
            // И считывать будет до тех пор, пока readLine не вернет null
            while ((line = bufferedReader.readLine()) != null) {
                //name|9|true
                Catty cat = parseCarFromStringLine(line);
                cats.add(cat);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cats;
    }

    private static Catty parseCarFromStringLine(String line) {
        //name|9|true
//        System.out.println("line: " + line);
        String[] strings = line.split("\\|");
//        System.out.println("arrayLineElements: " + Arrays.toString(strings));
        return new Catty(strings[0], Integer.parseInt(strings[1]), Boolean.valueOf(strings[2]));
    }

    private static void  writeCatsToFile(List<Catty> cats, File file) {

        // Удалим файл, если он существует
        if (file.exists()) file.delete();

        // Создаем файл, если его еще нет
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Catty cat: cats) {
            // Открываю поток записи, ставим флаг разрешающий дозапись в файл
            try (FileWriter fileWriter = new FileWriter(file, true);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
            ) {
                // name|age|isMale
                String toWrite = cat.getName() + "|" + cat.getAge() + "|" + cat.isMale();
                bufferedWriter.write(toWrite);
                bufferedWriter.newLine(); // перевод каретки

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Запись в файл завершена!");
    }
}

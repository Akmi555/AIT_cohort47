package lesson_44.fileIO;
/*
@date 15.07.2024
@author Sergey Bugaienko
*/

import java.io.*;
import java.util.Arrays;

public class FileIoExample {

    //Java IO (Input/Output)

    // class File - абстракция для работы с файлами и директориями (создание, удаление, проверка свойств и т.д)


    public static void main(String[] args) throws InterruptedException {

        File pathDir = new File("files");
        File pathDir2 = new File("files/db");

        // boolean mkdir() - создает директорию. Может создать только "конечную" директорию
        System.out.println(pathDir.mkdir());
        System.out.println(pathDir2.mkdir());

        // boolean mkdirs() - создает директорию, включая все необходимые родительские директории
        pathDir = new File("src/lesson_44/fileIO/files/example");
        System.out.println(pathDir.mkdirs());

        //File(File/String parent, String child) - создает объект file с указанием родительского пути
        File lessonDir = new File("src/lesson_44/fileIO");
        File pathDb = new File(lessonDir, "db/v01");
        System.out.println("pathDb.mkdirs(): " + pathDb.mkdirs());

        // delete() - удаляет папку или директорию
        System.out.println("pathDir.delete(): " + pathDir.delete());

        //deleteOnExit(); - удаляет файл или директорию при завершении работы JVM (приложения)
        pathDb.deleteOnExit();

        // Пауза в работе потока выполнения программы на n миллисекунд (Бросает исключение)
        Thread.sleep(5);

        System.out.println("Программа завершила работу");

        System.out.println("\n====================\n");
        File file = new File(lessonDir, "text.txt");

        // boolean createNewFile() - создает новый пустой файл, если файл с таким именем еще не существует.
        try {
            System.out.println("file.createNewFile(): " + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //exists() - проверяет существует ли файл или директория
        System.out.println("file.exists: " + file.exists() + " | " + " lessonDir.exists(): " +  lessonDir.exists());

        // isFile, isDirectory - возвращает true, если объект File является файлом / директорией
        System.out.println("file.isFile: " + file.isFile());
        System.out.println("lessonDir.isFile: " + lessonDir.isFile());
        System.out.println("file.isDirectory: " + file.isDirectory());
        System.out.println("lessonDir.isDirectory: " + lessonDir.isDirectory());

        System.out.println("length: " + file.length()); // размер файла в байтах
        System.out.println("lastModified: " + file.lastModified()); // время последнего изменения файла

        System.out.println("getName: " + file.getName()); // возвращает имя файла или директории
        System.out.println("gatPath: " + file.getPath()); // возвращает строковое представление пути к файлу / дирекории

        System.out.println("\n=====================\n");

        try {
            FileWriter fileWriter = new FileWriter(file, false); // флаг определяющий дозапись / перезапись
            fileWriter.write("Hello, World");
//            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Почитаем из файла
        // try-catch с ресурсами.

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            line = bufferedReader.readLine();
            System.out.println("Чтение завершено");
            System.out.println("line: " + line);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // String[] list() - список имен файлов и директорий в директории
        String[] names = lessonDir.list();
        System.out.println("names: " + Arrays.toString(names));

        //File[] listFiles() - массив объектов типа File представляющий файлы и директории
        File[] files = lessonDir.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName() + " | " + file1.getPath() + " | isFile: "+ file1.isFile());
        }

    }
}

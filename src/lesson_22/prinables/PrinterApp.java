package lesson_22.prinables;
/*
@date 13.06.2024
@author Sergey Bugaienko
*/

public class PrinterApp {
    public static void main(String[] args) {
        Printable book = new Book("Философия Java", "Б.Эккель");
        book.print();

        Printable journal = new Journal("Cosmopolitan", 154);
        journal.print();

        Book book1 = new Book("Мастер и Маргарита", "М.Булгаков");
        book1.print();

        book.test();
        journal.test();

        Printable.testStatic("Hello");
        System.out.println(Printable.PI);

        System.out.println("\n ========================= \n");

        ColorPrintable presentation = new Presentation("Inheritance", "Noname",
                "Inheritance in OOP", 20);

        presentation.colorPrint();
        presentation.print();
        presentation.test();

        System.out.println("\n ==================== \n");
        Printer printer = new Printer();

        printer.makeCopy(book);
        printer.makeCopy(presentation);
        printer.makeCopy(new Journal("ManHealth", 14));




    }
}

package lesson_24.interfaces;

public class Application {

    public static void main(String[] args) {

        Book book = new Book("Мастер и Маргарита", "М. Булгаков");

//        Object objBook = (Object) book;
//        System.out.println("Ссылка типа object: " + objBook.toString());

        Journal journal = new Journal("Cosmopolitan", 154);

        Printable printable = journal; // неявное приведение типа ссылки
        printable.print();

        book.print();

        Printable book1 = new Book("Философия Java", "Б. Эккель");
        book1.print();

        book.test();
        journal.test();

        Printable.testStatic("Hello!");

        System.out.println("\n=========================\n");

        Presentation presentation = new Presentation(
                "Ihheritance",
                "Noname",
                "Inheritance in OOP",
                20);

        presentation.print();
        presentation.colorPrint();
        presentation.test();

        Printable printable1 = presentation;
        printable1.print();

    }

}
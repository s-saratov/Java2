package homework_15;

/*
Task 1
Посмотрите вокруг себя.

Напишите три класса, описывающие какие-то сущности вокруг Вас.
Не забудьте использовать абстракцию.
Например, опишите студента, преподавателя и, допустим, врача.
Вы можете выбрать свои сущности для описания.
 */

public class Task1 {

    public static void main(String[] args) {

        System.out.println("1. Объекты класса ProgrammingLanguage\n");

        ProgrammingLanguage java = new ProgrammingLanguage();

        java.getInfo();
        System.out.println();

        ProgrammingLanguage c = new ProgrammingLanguage("C", "процедурный",
                1972, true);

        ProgrammingLanguage python = new ProgrammingLanguage("Python", "мультипарадигмальный",
                1991, false);

        java.compareAge(java, c);
        java.compareAge(java, python);

        System.out.println("\n2. Объекты класса Computer\n");

        Computer appleMacBook = new Computer("Apple MacBook Pro 2023", "Apple M2 Max (12-core)",
                "38-core Integrated", 32, 1024, 2023, 3499);
        Computer lenovoThinkPad = new Computer("Lenovo ThinkPad X1 Extreme Gen 6", "Intel Core i9-13900H (14-core)",
                "NVIDIA GeForce RTX 4080 (8GB GDDR6)", 32, 1024, 2023, 3399);

        appleMacBook.getInfo();
        System.out.println();
        lenovoThinkPad.getInfo();
        System.out.println();
        appleMacBook.comparePrice(appleMacBook, lenovoThinkPad);

        System.out.println("\n3. Объекты класса Car\n");

        Car maybach = new Car("Mercedes-Maybach\t", "S 680 4MATIC", 2024, 621,
                82, 14.0, 40);
        Car zaz = new Car("ЗАЗ", "965", 1969, 27, 27, 6.5, 10);

        maybach.getInfo();
        System.out.println();
        zaz.getInfo();
        System.out.println();

        zaz.drive(zaz, 500);
        zaz.fillTheTank(zaz);
        zaz.drive(zaz, 400);

    }

}
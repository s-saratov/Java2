package lesson_15;

public class MainCats {

    public static void main(String[] args) {

        Cat cat = new Cat(); // Создаём объект класса Cat
        // 1. Физически создаётся объект в памяти
        // 2. Вызывается конструктор класса для инициализации свойств объекта (заполнение полей)

        cat.sayMeow();
        cat.run();
        cat.sleep();

        /*
        При создании объекта класса все его поля инициализируются значениями по умолчанию:
            - для числовых примитивных типов -> 0 / 0.0;
            - для boolean -> false;
            - для всех ссылочных (в т.ч. String) -> null.
         */

        String catName = cat.name;
        System.out.println("Имя: " + catName);

        int catAge = cat.age;
        System.out.println("Возраст: " + cat.age);

        System.out.println("\n=====================\n");

        Cat cat1 = new Cat("Max");
        // Будет создан новый объект класса Cat
        // Имя (строка), которое было передано в конструкторе, будет присвоено полю класса name

        System.out.println("Color: " + cat1.color);
        System.out.println("Name: " + cat1.name);

        System.out.println("\n=====================\n");

        Cat cat2 = new Cat("Diamond", "red");
        cat2.whoAmI();

        System.out.println("\n=====================\n");

        Cat barsik = new Cat("Barsik", "white", 2);
        barsik.whoAmI();

    }

}
package lesson_16;

import homework_15.Car;
import lesson_15.Cat;

public class Lesson16 {

    public static void main(String[] args) {

        int x = 10;

        Cat catVar = new Cat();

        /*
        1. Создаётся новый объект класса Cat.
        2. Вызывается конструктор для инициализации полей объекта.
         */

        catVar.whoAmI();

        System.out.println(catVar.name);

        catVar.name = "Jack";

        System.out.println(catVar.name);
        catVar.whoAmI();

        System.out.println("========================\n");

        Cat barsik = new Cat("Barsik", "grey", 3);
        barsik.whoAmI();
        System.out.println("name: " + barsik.name);
        System.out.println("color: " + barsik.color);
        System.out.println("age: " + barsik.age);
        barsik.age = 12;

        // Возможно создавать несколько объектов с одинаковыми значениями полей, если это нужно
        // TODO: Дописать
        System.out.println("========================\n");
        Cat cat1 = new Cat("Barsik", "grey", 3);
        cat1.whoAmI();

        Cat catClone = cat1;
        catClone.whoAmI();

        cat1.age = 100;
        cat1.whoAmI();
        catClone.whoAmI();
        System.out.println(catClone.age);
        catClone.name = "Max";

        catClone.whoAmI();
        cat1.whoAmI();

        catClone = new Cat("Kratos", "black", 99);
        catClone.whoAmI();
        cat1.whoAmI();

        catClone = null; // если у ссылки на null попытаться вызвать метод, программа завершится аварийно.
//        NullPointerException. У null нельзя вызвать метод, присвоить значения полю и т.д.
//        Нет привязки к объекту.
        if (catClone != null) {
            System.out.println(catClone.name);
            catClone.whoAmI();
        }


    }

}

package homework_19;

/*
Task 5:
- создать 5 объектов класса Dog (из предыдущего ДЗ) со случайным прыжком от 30 до 80;
- создать массив "барьеров" на 7 значений. Заполнить массив случайными значениями от 70 до 170;
- каждая из собак должна по очереди попробовать преодолеть каждый барьер из массива барьеров;
- посчитать и вывести на экран сколько барьеров удалось преодолеть каждой собаке.
 */

public class Dog {

    // Поля

    private String name;
    private double jumpHeight;
    private final double maxJumpHeight;

    // Конструктор

    public Dog(String name, double jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    // Геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    // Методы

    // 1. Прыгать через барьер

    public void jumpBarrier(float barrier) {
        if (barrier > maxJumpHeight) {
            System.out.printf("К сожалению, попытка бессмысленна. Собака %s не сможет преодолеть барьер высотой " +
                    "%.1f см даже в своей лучшей физической форме.\n", name, barrier);
            return;
        }
        else if (jumpHeight < barrier) {
            System.out.printf("В настоящее время собака %s не сможет преодолеть барьер высотой " +
                    "%.1f см. Необходима тренировка!\n", name, barrier);
            do { train(); } while (jumpHeight < barrier);
        }
        System.out.printf("Але - гоп! Собака %s успешно взяла высоту %.1f см.\n", name, barrier);
    }

    // 2. Тренироваться

    public void train() {

        if (jumpHeight + 10.0 > maxJumpHeight) jumpHeight = maxJumpHeight;
        else jumpHeight += 10.0;
        System.out.printf("Тренировка завершена. Теперь высота прыжка собаки %s составляет %.1f сантиметров.\n",
                name, jumpHeight);
    }

    // 3. Получить строковое представление экземпляра класса

    public String toString() {
        return String.format("Собака по кличке %s, текущая высота прыжка: %.1f см, максимальная высота прыжка: %.1f " +
                        "см.", name, jumpHeight,maxJumpHeight);
    }



}
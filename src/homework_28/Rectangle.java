package homework_28;

/*
Task 1
Создание класса “Rectangle”

Создайте класс Rectangle, который представляет прямоугольник со следующими полями:
    - length (длина) — тип double !DONE!
    - width (ширина) — тип double !DONE!

Требования:

1. Конструкторы:
   - Создайте конструктор, который инициализирует оба поля класса.                                              !DONE!
   - Создайте конструктор без параметров (по умолчанию), который устанавливает длину и ширину в значение 1.0.   !DONE!

2. Методы:
   - Реализуйте методы доступа (геттеры и сеттеры) для каждого поля.    !DONE!
   - Переопределите метод toString(), чтобы он возвращал строковое представление объекта Rectangle в формате:
   "Прямоугольник [длина=..., ширина=...]".

Метод main(): в методе main() создайте несколько объектов Rectangle и выведите их на экран, используя метод toString().

Task 2
Сравнение объектов класса “Rectangle”

Используя класс Rectangle из первого задания, необходимо реализовать сравнение объектов на равенство по их содержимому.

Требования:
1. Переопределение метода equals(): переопределите метод equals() в классе Rectangle,
чтобы два объекта считались равными, если у них совпадают значения полей length и width.

2. Метод main():
    - Создайте несколько объектов Rectangle, некоторые из которых имеют одинаковые длину и ширину.
    - Сравните объекты между собой, используя метод equals(), и выведите результаты сравнения на экран.

Task 3
Удаление дубликатов из списка объектов “Rectangle”

Создайте метод, который принимает список объектов Rectangle и объект Rectangle,
и удаляет из списка все объекты, которые равны переданному объекту (по значению полей length и width).

Требования:

1. Метод удаления дубликатов:
    - Реализуйте метод removeDuplicates, который принимает список List<Rectangle> и объект Rectangle.
    - Метод должен удалить из списка все объекты, которые равны переданному объекту (используя переопределённый метод equals()).

2. Метод main():
    - Создайте список MyArrayList<Rectangle> и добавьте в него несколько объектов, включая дубликаты.
    - Вызовите метод removeDuplicates, передав ему список и объект Rectangle, дубликаты которого нужно удалить.
    - Выведите на экран список до и после удаления дубликатов.

Важно!
    - Будьте внимательны при удалении элементов из списка во время перебора в цикле.
    - Если вы удаляете элементы из списка, по которому в данный момент итерируетесь, это может привести к ошибкам или пропуску элементов.
    - Подумайте, как можно правильно организовать цикл, чтобы корректно удалить необходимые элементы без возникновения проблем.
 */

import lesson_28.Employee;

import java.util.Objects;

public class Rectangle {

    // Поля

    private double length;
    private double height;

    // Конструкторы

    // 1. Инициализирующий оба поля класса

    public Rectangle() {
        setLength(1.0);
        setHeight(1.0);
    }

    // 2. Без параметров (по умолчанию), который устанавливает значения длины и ширины в значение 1.0.

    public Rectangle(double length, double height) {
        setLength(length);
        setHeight(height);
    }

    // Геттеры и сеттеры

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        // Если передано некорректное значение длины, устанавливается стандартное значение (1.0)
        if (length <= 0) this.length = 1.0;
        else this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        // Если передано некорректное значение высоты, устанавливается стандартное значение (1.0)
        if (height <= 0) this.height = 1.0;
        else this.height = height;
    }

    // Методы

    // 1. Возвращение строковое представление экземпляра класса

    @Override
    public String toString() {
        return "Прямоугольник [" +
                "длина=" + getLength() +
                ", ширина=" + getHeight() +
                ']';
    }

    // 2. Возвращает результат сравнения с другим экземпляром класса прямоугольников

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // возвращаем true, если ссылки ссылаются на один и тот же объект

        // JDK 16 и выше
        // if (!(obj instanceof Rectangle rectangle)) return false;

        if (!(obj instanceof Rectangle)) return false; // проверяем на возможность привести к Rectangle
        Rectangle rectangle = (Rectangle) obj;
        return height == rectangle.height &&
                length == rectangle.length;
    }

}
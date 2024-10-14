package homework_23.shapes;

/*
Task 1

Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */

abstract class Shape {

    // Поля

    private String name;        // имя
    private double area;        // площадь
    private double perimeter;    // периметр

    // Конструктор

    public Shape(String name) {
        this.name = name;
    }

    // Геттеры и сеттеры

    public String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }
    protected void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }
    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    // Методы

    // 1. Возвращает строковое представление экземпляра класса

    public String toString() {
        return "Фигура " + name + ", имеющая площадь: " + area + " и периметр: " + perimeter;
    }

    // 2. Рассчитывает площадь фигуры (абстрактный)

    abstract void calculateArea();

    // 3. Рассчитывает периметр фигуры (абстрактный)

    abstract void calculatePerimeter();

}
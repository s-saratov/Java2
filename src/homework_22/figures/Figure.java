package homework_22.figures;

/*
Task 3
Фигуры и их площади

Создайте класс Фигура с методом рассчитатьПлощадь().
Реализуйте классы различных геометрических фигур (например, Круг, Квадрат, Треугольник).
В главном классе создайте список фигур и вычислите площадь каждой из них.
 */

public class Figure {

    // Поля

    private String name;    // имя
    private double area;    // площадь

    // Конструктор

    public Figure(String name) {
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

    // Методы

    // 1. Возвращает строковое представление экземпляра класса

    public String toString() {
        return "Фигура " + name + ", имеющая площадь: " + this.area;
    }

    // 2. Рассчитывает площадь фигуры

    protected void calculateArea() {}

}

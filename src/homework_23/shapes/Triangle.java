package homework_23.shapes;

public class Triangle extends Shape {

    // Поля

    private double a;  // длина стороны A
    private double b;  // длина стороны B
    private double c;  // длина стороны C

    // Конструктор

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;

        if (!isValidSides()) {
            // Стороны неправильные. Построить такой треугольник невозможно.
            System.out.println("Построить треугольник с такими сторонами невозможно");
            // TODO: Надо выбросить ошибку или закрыть конструктор
            // Устанавливаем значения "по умолчанию"
            this.a = 3;
            this.b = 4;
            this.c = 5;
        }

        calculateArea();
        calculatePerimeter();
    }

    // Методы:

    // 1. Рассчитывает площадь треугольника (по формуле Герона)

    @Override
    protected void calculateArea() {
        double p = (a + b + c) / 2;                         // расчёт полупериметра треугольника
        setArea(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    // 2. Рассчитывает периметр треугольника

    @Override
    void calculatePerimeter() {
        setPerimeter(a + b + c);
    }

    // 3. Проверяет, возможно ли создать треугольник с заданными длинами сторон

    private boolean isValidSides() {
        return a + b > c && a + c > b && b + c > a;
    }
}
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
}
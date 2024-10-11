package homework_22.figures;

public class Triangle extends Figure {

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
    }

    // Метод, рассчитывающий площадь треугольника (по формуле Герона)

    @Override
    protected void calculateArea() {
        double p = (a + b + c) / 2;                         // расчёт полупериметра треугольника
        setArea(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

}
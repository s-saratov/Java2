package homework_23.shapes;

public class Rectangle extends Shape {

    // Поле

    private double a;  // длина стороны A
    private double b;  // длина стороны B

    // Конструктор

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
        calculateArea();
        calculatePerimeter();
    }

    // Методы:

    // 1. Рассчитывает площадь прямоугольника

    @Override
    protected void calculateArea() {
        setArea(a * b);
    }

    // 2. Рассчитывает площадь прямоугольника

    @Override
    void calculatePerimeter() {
        setPerimeter(2 * a + 2 * b);
    }
}
package homework_23.shapes;

public class Circle extends Shape {

    // Поле

    private double radius;  // радиус

    // Конструктор

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    // Методы:

    // 1. Рассчитывает площадь круга

    @Override
    protected void calculateArea() {
        setArea(Math.PI * radius * radius);
    }

    // 2. Рассчитывает периметр (длину окружности)

    @Override
    protected void calculatePerimeter() {
        setPerimeter(2.0 * Math.PI * radius);
    }
}
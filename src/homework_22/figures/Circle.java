package homework_22.figures;

public class Circle extends Figure {

    // Поле

    private double radius;  // радиус

    // Конструктор

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
        calculateArea();
    }

    // Метод, рассчитывающий площадь круга

    @Override
    protected void calculateArea() {
        setArea(Math.PI * radius * radius);
    }

}
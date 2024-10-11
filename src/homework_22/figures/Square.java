package homework_22.figures;

public class Square extends Figure {

    // Поле

    private double side;  // длина стороны

    // Конструктор

    public Square(String name, double side) {
        super(name);
        this.side = side;
        calculateArea();
    }

    // Метод, рассчитывающий площадь квадрата

    @Override
    protected void calculateArea() {
        setArea(side * side);
    }

}
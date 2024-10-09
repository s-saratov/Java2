package homework_20.shapes;

public class Circle extends Shape {

    // Поле (радиус)

    private double radius;

    // Сеттер (радиус)

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Метод, вычисляющий и выводящий площадь круга

    public void calculateArea() {
        if (radius < 0) return;
        System.out.printf("Площадь круга %s составляет %f.\n", getName(), (PI * radius * radius));
    }
}
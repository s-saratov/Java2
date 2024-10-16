package homework_23.shapes;

public class ShapesMain {

    public static void main(String[] args) {

        // Создаём три фигуры

        Circle circle = new Circle("Михаил",5.0);
        Rectangle square = new Rectangle("прямоугольник", 10.0, 20.0);
        Triangle triangle = Triangle.createTriangle("треугольник", 7.5, 10.2, 8.3);

        // Создаём массив экземпляров класса Figure, который заполняем преобразованными фигурами

        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = triangle;

        double sumPerimeters = 0;
        double sumAreas = 0;

        // Выводим на экран список фигур и их площади

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("№ " + (i + 1) + ": " + shapes[i].toString());
            sumPerimeters += shapes[i].getPerimeter();
            sumAreas += shapes[i].getArea();
        }

        System.out.println("\nОбщий периметр фигур в массиве: " + sumPerimeters);
        System.out.println("Общая площадь фигур в массиве: " + sumAreas);

    }

}
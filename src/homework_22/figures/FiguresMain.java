package homework_22.figures;

public class FiguresMain {

    public static void main(String[] args) {

        // Создаём три фигуры

        Circle circle = new Circle("Михаил",5.0);
        Square square = new Square("квадрат", 10.0);
        Triangle triangle = new Triangle("треугольник", 7.5, 10.2, 8.3);

        // Создаём массив экземпляров класса Figure, который заполняем преобразованными фигурами

        Figure[] figures = new Figure[3];
        figures[0] = circle;
        figures[1] = square;
        figures[2] = triangle;

        // Выводим на экран список фигур и их площади

        for (int i = 0; i < figures.length; i++) {
            System.out.println("№ " + (i + 1) + ": " + figures[i].toString());
        }

    }

}
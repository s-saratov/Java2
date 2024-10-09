package homework_20.shapes;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        rectangle.setDimensions(12.345, 67.89);
        circle.setRadius(38.83);

        rectangle.setName("Безымянный");
        rectangle.setColor("Красный");

        circle.setName("Михаил");
        circle.setColor("Синий");

        rectangle.displayInfo();
        circle.displayInfo();

        rectangle.calculateArea();
        circle.calculateArea();

    }

}
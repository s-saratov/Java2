package homework_20.shapes;

public class Rectangle extends Shape {

    // Поля

    private double width;   // ширина
    private double height;  // высота

    // Методы

    // 1. Устанавливает значения полей width и height
    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 2. Вычисляет и выводит площадь прямоугольника
    public void calculateArea() {
        if (width < 0 || height < 0) System.out.println("Как минимуму один из размеров некорректен (меньше нуля)");
        System.out.printf("Площадь прямоугольника %s составляет %f.\n", getName(), (width * height));
    }




}
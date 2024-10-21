package homework_28;

import lists.MyArrayList;
import lists.MyList;

public class RectangleTest {

    public static void main(String[] args) {

        System.out.println("============ Task 1 ============\n");

        // 1. Создаём три прямоугольника размерностей (3.0, 5.0), (4.0, 4.0) и стандартной (1.0, 1.0)

        Rectangle rectangle1 = new Rectangle(3.0, 5.0);
        Rectangle rectangle2 = new Rectangle(4.0, 4.0);
        Rectangle rectangle3 = new Rectangle();

        // 2. Выводим на экран строковое представление созданных прямоугольников

        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(rectangle3.toString());

        System.out.println("\n============ Task 2 ============\n");

        // 3. Воспроизводим из LMS код создания прямоугольников и их сравнения

        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        Rectangle rect3 = new Rectangle(4.0, 2.0);

        System.out.println(rect1.equals(rect2));
        System.out.println(rect1.equals(rect3));

        System.out.println("\n============ Task 3 ============\n");

        // 4. Воспроизводим из LMS код создания списка прямоугольников и удаления из него искомого

        MyList<Rectangle> rectangles = new MyArrayList<>();
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

        System.out.println("Список до удаления дубликатов:");
        for (int i = 0; i < rectangles.size(); i++) {
            System.out.println(rectangles.get(i));
        }

        Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
        RectangleUtils.removeDuplicates(rectangles, rectangleToRemove);

        System.out.println("\nСписок после удаления дубликатов:");
        for (int i = 0; i < rectangles.size(); i++) {
            System.out.println(rectangles.get(i));
        }

    }

}
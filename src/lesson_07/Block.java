package lesson_07;

public class Block {

    public static void main(String[] args) {

        int x = 10;

        {
            int y = 5;
            x = x + y;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }

        // x = x + y; // Ошибка компиляции. Переменная не видна (недоступна) вне своего блока.

        // Новая переменная с именем y
        int y = 124;

    }
}
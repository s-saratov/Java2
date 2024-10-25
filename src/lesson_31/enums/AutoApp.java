package lesson_31.enums;

public class AutoApp {

    public static void main(String[] args) {

        Color color = Color.RED;
        System.out.println(color);

        Auto auto = new Auto("Modell", Color.BLUE);
        System.out.println(auto);

        auto.setColor(color);
        System.out.println(auto);

        System.out.println("\n==================\n");

        // Методы Enum

        // Возвращает массив всех значений
        Color[] colors = Color.values(); // возвращает массив всех значений

        for (Color cuurentColor : colors) {
            System.out.println(cuurentColor);
        }

        // Возвращает enum по строковому имени
        Color color1 = Color.valueOf("RED");
        System.out.println(color1);

        // Получить имя константы
        String name = Color.RED.name();
        System.out.println(name + "!");

        // Получить порядковый номер (начиная с 0)
        int ordinal = Color.GREEN.ordinal();
        System.out.println("ordinal: " + ordinal);

        System.out.println(auto);

        // Enum безопасно сравнивать на равенство оператором ==

        if (auto.getColor() == Color.GREEN) {
            System.out.println("Цвет авто зелёный");
        } else {
            System.out.println("Не зелёный");
        }

        System.out.println("\n========== switch ==========\n");

        // Очень часто используется switch
        switch (color) {
            case RED:
                System.out.println("Красный");
                break;

            case GREEN:
                System.out.println("Зелёный");
                break;

            default:
                System.out.println("Красный");
        }

    }

}
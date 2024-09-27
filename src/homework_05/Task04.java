package homework_05;

public class Task04 {
    public static void main(String[] args) {
        String string = "Python is the best language";

        // Заменить в строке string слово Python на слово Java и сохранить результат в переменную string1
        // Вывести на экран string1

        String string1 = string.replace("Python", "Java");
        System.out.println("string1: " + string1);

    }
}

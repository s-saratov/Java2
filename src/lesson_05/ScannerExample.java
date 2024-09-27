package lesson_05;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        // Прочитать целое число
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt(); // Считать число типа int
        scanner.nextLine(); // "Скушать" остаток строки

        System.out.println("Введите ваш рост в см: ");
        int height = scanner.nextInt();
        // либо: double height = scanner.nextDouble();

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("height: " + height);

    }

}

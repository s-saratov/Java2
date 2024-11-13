package homework_45.validator;

import java.util.ArrayList;
import java.util.List;

public class ValidateApp {

    public static void main(String[] args) {

        // Получаем адрес электронной почты от пользователя (сканером, из другого приложения)
        String email = "test@email.com";

        // Создаём коллекцию паролей
        List<String> passwords = new ArrayList<>(List.of(
                "1234567",      // некорректный - длиной меньше 8 символов
                "abcdefgh",     // некорректный - без цифр
                "A1B2C3D4",     // некорректный - без строчных букв
                "a1b2c3d4",     // некорректный - без прописных букв и спецсимволов
                "A1b2c3d!"      // корректный
        ));

        // Валидация адреса электронной почты
        try {
            EmailValidator.isEmailValid(email);
            // Если мы дойдём до этой строчки кода, значит email валидный
            System.out.println("Email прошёл проверку");
            // User user = new User(email, password);
        } catch (EmailValidateException e) {
            // email не прошёл проверку
            // Запросить у пользователя другой ввод
            System.out.println("Email is not valid");
            String message = e.getMessage();
            System.out.println(message);
        }

        // Валидация пароля
        int i = 1;
        for (String password : passwords) {
            System.out.printf("%d. Trying password \"%s\": ", i++, password);
            try {
                EmailValidator.isPasswordValid(password);
                System.out.println("password accepted");
            } catch (PasswordValidateException e) {
                System.out.print("password is not valid -> ");
                String message = e.getMessage();
                System.out.println(message);
            }
        }

    }

}
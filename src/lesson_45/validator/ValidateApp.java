package lesson_45.validator;

import homework_44.users.User;

public class ValidateApp {

    public static void main(String[] args) {

        // Получаем email от пользователя (сканером, из другого приложения)
        String email = "test@email.com";
        String password = "123456";

        // Валидация email
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

    }

}
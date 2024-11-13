package homework_45.validator;

/*
Task 1

Добавить в класс EmailValidator валидацию пароля.
При провале валидации выбросить исключение: PasswordValidateException.
 */

public class EmailValidator {

    // throw - ключевое слово, используемое для явного выбора исключения (создания объекта исключения)

    // 1. Проверка адреса электронной почты на соответствие требованиям

    public static void isEmailValid(String email) throws EmailValidateException {

        if (email == null) throw new EmailValidateException("null was passed"); // исключаем передачу null

        // 1. Должен присутствовать @, и только один

        int indexAt = email.indexOf('@'); // индекс символа @ в строке
        // int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) throw new EmailValidateException("@ error");

        // 2. После @ должна быть точка

        int dotIndexAfterAt = email.indexOf('.', indexAt + 1); // индекс точки
        if (dotIndexAfterAt == -1) throw new EmailValidateException(". after @ error");

        // 3. После последней точки есть два и более символа

        int lastDotIndex = email.lastIndexOf('.'); // индекс последней точки
        if ((email.length() - lastDotIndex) < 3) throw new EmailValidateException("last . error");

        // 4. Латинский алфавит, цифры, '-', '_', '.', '@'

        /*
        Я беру каждый символ. Проверяю, что он не является "запрещенным"
        И если нахожу не подходящий символ - возвращаю false
         */
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            // Если символ удовлетворяет одному из условий на "правильность"
            boolean isPass = (Character.isAlphabetic(ch) ||
                    Character.isDigit(ch) ||
                    ch == '-' ||
                    ch == '_' ||
                    ch == '.' ||
                    ch == '@');

            // Если любой символ НЕ подходящий, сразу возвращаем false
            if (!isPass) throw new EmailValidateException("illegal symbol");

            /*
            Равнозначные выражения.
            if (!Character.isAlphabetic(ch) && !Character.isDigit(ch) && ch != '-' && ch != '_' && ch != '.' && ch != '@') return false;
            if (!(Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '-' || ch == '_' || ch == '.' || ch == '@')) return false;
             */
        }

        // 5. До @ должен быть хотя бы один символ

        if (indexAt == 0) throw new EmailValidateException("@ should not be the first");

        // 6. Первым символом должна быть буква

        if (!Character.isLetter(email.charAt(0))) throw new EmailValidateException("first symbol should be alphabetic");

    }

    // 2. Проверка пароля на соответствие требованиям

    private void isPasswordValid(String password) throws PasswordValidateException{

        if (password == null) throw new PasswordValidateException("null was passed"); // исключаем передачу null

        String specialChars = "!%$@&*()[].,-";

        // Условие № 1: длина >= 8 символов
        if (password.length() < 8) throw new PasswordValidateException("the length is less than 8 characters");

        for (int i = 0; i < password.length(); i++) {
            // условие № 2: минимум 1 цифра
            if (!Character.isDigit(password.charAt(i))) throw new PasswordValidateException("there are no numbers");
            // условие № 3: минимум 1 маленькая буква
            if (!Character.isLowerCase(password.charAt(i))) throw new PasswordValidateException("small letters are missing");
            // условие № 4: минимум 1 большая буква
            if (!Character.isUpperCase(password.charAt(i))) throw new PasswordValidateException("capital letters are missing");
            // условие № 5: минимум 1 спецсимвол (!%$@&*()[].,-)
            if (specialChars.indexOf(password.charAt(i)) == -1) throw new PasswordValidateException("special characters are missing");
        }

    }

}
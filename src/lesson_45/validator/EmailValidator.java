package lesson_45.validator;

public class EmailValidator {

    // throw - ключевое слово, используемое для явного выбора исключения (создания объекта исключения)

    public static void isEmailValid(String email) throws EmailValidateException{

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

}
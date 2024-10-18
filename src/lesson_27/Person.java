package lesson_27;

public class Person {

    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailvalid(email)) {
            this.email = email;
        }
    }

    /*
    test@gmail.com.net

    Требования к адресу электронной почты:
    1. Долен присутствовать @, и только один
    2. После @ должна быть точка
    3. После последней точки есть два и более символа
    4. Латинский алфавит, цифры, '-', '_', '.', '@'
    5. До @ должен быть хотя бы один символ
    6. Первым символом должна быть буква
     */

    private boolean isEmailvalid(String email) {

        // 1. Долен присутствовать @, и только один

        int indexAt = email.indexOf('@');
        // int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        // 2. После @ должна быть точка

        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        // Полезные методы класса Character

        // Возвращает true, если символ - буква
        Character.isAlphabetic('c');

        // Возвращает true, если символ - цифра
        Character.isDigit('1');
        Character.isLetter('3');
        Character.isLetterOrDigit('-');

        return false;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}

/*
Требования к паролю:
- длина >= 0
- минимум 1 цифра
- минимум 1 маленькая буква
- минимум 1 большая буква
- минимум 1 спецсимвол (!%$@&*()[].,-)

5 boolean переменных. Каждая отвечает за своё требование
Пароль будет подходить, только если все пять true
return b1 && b2 && b3 && b4 && b5
 */
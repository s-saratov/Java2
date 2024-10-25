package homework_29;

/*
Task1

Написать тестовый метод для проверки работы с "не валидными" email в классе Person.

Тестовые данные должны содержать максимально полный набор не валидных email-ов:
    - с двумя собаками;
    - без точки после собаки;
    - и так далее.

Task2

Написать тесты установки пароля в классе Person. Валидные / не валидные пароли.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PersonTests {

    // Создаём массив некорректных адресов электронной почты:

    private static final String[] incorrectEmails = {
            "test@test@test.com",  // с двумя символами @
            "test@testcom",        // без точки после @
            "test@test.c",         // с доменом первого уровня из одного символа
            "te$t@test.com",       // с недопустимым символом $
            "@test.com",           // без букв до @
            "0test@test.com"       // с первым символом, не являющимся буквой
    };

    // Создаём массив некорректных паролей:

    private static final String[] incorrectPasswords = {
            "1234567",      // длиной меньше 8 символов
            "abcdefgh",     // без цифр
            "A1B2C3D4",     // без строчных букв
            "a1b2c3d4",     // без прописных букв и спецсимволов
    };

    // Тест некорректных адресов электронной почты

    @ParameterizedTest
    // @ValueSource(strings = incorrectEmails)
    @ValueSource(strings = {"test@test@test.com", "test@testcom", "test@test.c", "te$t@test.com", "@test.com", "0test@test.com"})
    public void testInvalidEmails(String email) {
        Person person = new Person("email", "password");
        person.setEmail(email);
        Assertions.assertNull(person.getEmail());
    }

    // Тест корректного адреса электронной почты

    @Test
    public void testValidEmail() {
        Person person = new Person("email", "password");
        person.setEmail("test@test.com"); // пробуем задать адрес электронной почты, соответствущий всем требованиям
        Assertions.assertEquals(person.getEmail(), "test@test.com");
    }

    // Тест некорректных паролей

    @ParameterizedTest
    // @ValueSource(strings = incorrectPasswords)
    @ValueSource(strings = {"1234567", "abcdefgh", "A1B2C3D4", "a1b2c3d4"})
    public void testInvalidPasswords(String email) {
        Person person = new Person("email", "password");
        person.setPassword(email);
        Assertions.assertNull(person.getPassword());
    }

    // Тест корректного пароля

    @Test
    public void testValidPassword() {
        Person person = new Person("email", "password");
        person.setPassword("A1b2c3d!"); // пробуем задать пароль, соответствущий всем требованиям
        Assertions.assertEquals(person.getPassword(), "A1b2c3d!");
    }

}
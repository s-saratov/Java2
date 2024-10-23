package homework_30;

/*
Task 1

Написать тесты установки пароля в классе Person. Валидные / не валидные пароли.
 */

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    // 1. Тест корректного адреса электронной почты

    @Test
    @Order(10)
    void testValidEmailSet() {
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);
        System.out.println("getEmail: " + person.getEmail());

        Assertions.assertEquals(validEmail, person.getEmail());
    }

    // 2. Тест некорректных адресов электронной почты

    @ParameterizedTest
    @Order(20)
    @MethodSource("invalidEmailData")
    void testInvalidEmail(String invalidEmail) {
        person.setEmail(invalidEmail);
        Assertions.assertNotEquals(invalidEmail, person.getEmail());
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    // 2.1. Служебный метод, создающий поток некорректных адресов электронной почты

    static Stream<String> invalidEmailData() {
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.ne.t",
                "test@mail.net.",
                "test@mailne.t",
                "test@ mail.net",
                "test@ma!il.net",
                "t#est@mail.net",
                "test@mail.?net",
                "@testmail.net",
                "1test@mail.net",
                "_test@mail.net",
                "-test@mail.net",
                ".est@mai.net",
                "test+1@mail.net"
        );
    }

    // 3. Тест корректного пароля

    @Test
    @Order(30)
    void testValidPasswordSet() {
        String validPassword = "A1b2c3d!"; // пароль, соответствущий всем требованиям

        person.setPassword(validPassword);
        System.out.println("getPassword: " + person.getPassword());

        Assertions.assertEquals(validPassword, person.getPassword());
    }

    // 4. Тест некорректных паролей

    @ParameterizedTest
    @Order(40)
    @MethodSource("invalidPasswordData")
    void testInvalidPassword(String invalidPassword) {
        person.setPassword(invalidPassword);
        Assertions.assertNotEquals(invalidPassword, person.getPassword());
        Assertions.assertEquals(startPassword, person.getPassword());
    }

    // 4.1. Служебный метод, создающий поток некорректных паролей

    static Stream<String> invalidPasswordData() {
        return Stream.of(
                "1234567",  // длиной меньше 8 символов
                "abcdefgh",         // без цифр
                "A1B2C3D4",         // без строчных букв
                "a1b2c3d4"          // без прописных букв и спецсимволов
        );
    }

}
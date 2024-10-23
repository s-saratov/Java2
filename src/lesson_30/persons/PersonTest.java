package lesson_30.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    /*
    1. Берём валидный email
    2. Устанавливаем сеттером валидный email person-у
    3. Мы ожидаем, что у person в поле email будет email, который мы установили на шаге 2
    4. Проверить равенство person.getEmail() с валидным email, который мы устанавливали
     */

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);
        System.out.println("getEmail: " + person.getEmail());

        Assertions.assertEquals(validEmail, person.getEmail());
    }

    /*
    1. Берём невалидный email
    2. Устанавливаем сеттером невалидный email person-у
    3. Ожидаем результат: email установлен не будет, т.е.:
        1). Значение email у person не будет равно невалидному email;
        2). Значение поля email у person останется прежним
    4.
     */

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmail(String invalidEmail) {
        person.setEmail(invalidEmail);
        Assertions.assertNotEquals(invalidEmail, person.getEmail());
        Assertions.assertEquals(startEmail, person.getEmail());
    }

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

}

/*
Требования к адресу электронной почты:
    1. Должен присутствовать @, и только один
    2. После @ должна быть точка
    3. После последней точки есть два и более символа
    4. Латинский алфавит, цифры, '-', '_', '.', '@'
    5. До @ должен быть хотя бы один символ
    6. Первым символом должна быть буква
 */
package lesson_30.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {

    // Метод, который выполняется перед КАЖДЫМ тестовым методом
    @BeforeEach
    void setUp() {
        System.out.println("Method @BeforeEach");
    }

    /*
    @BeforeAll  - выполняется только один раз перед выполнением первого теста
    @AfterEach  - выполняется после КАЖДОГО тестового метода
    @AfterAll   - выполняется только один раз после выполнения всех тестовых методов
    @Disabled   - указывает, что тест отключен и выполняться не будет
    @Nested     - позволяет создать вложенный тестовый класс. Может быть использован для логической группировки тестовых
                методов

    */

    // Аннотация (@) указывает, что метод является тестовым
    // Таким образом JUnit знает, что этот метод нужно запустить во время выполнения тестов

    @Test
    public void testAddition() {

        System.out.println("Test Addition");

        int result = 2 + 2;

        // Ожидаемое значение 4
        // Реальное значение - в переменной result

        // Методы проверки утверждений
        // assertEquals(expected, actual) - проверяет, равны ли два значения

        Assertions.assertEquals(4, result); // проверяет, равны ли два значения

        // тест будет пройден, если "неожидаемый" результат не совпадает с фактическим
        Assertions.assertNotEquals(5, result);

        Assertions.assertTrue(result >= 4); // проверяет, что условие верно, т.е. возвращает true
        assertFalse(result > 4); // проверяет, что условие ложно, т.е. возвращает false
        assertNull(null); // проверяет, что объект равен null
        assertNotNull("String"); // проверяет, что объект не равен null

    }

    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Test Empty");
        // Пустой тестовый метод считается пройденным
        // (если в методе нет ложного утверждения)
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"})
    public void testFruits(String fruit) {
        System.out.println(fruit);
        assertTrue(fruit.length() > 2);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, -1, 4, 5})
    void testInts(int value) {
        System.out.println("current value " + value);
        Assertions.assertTrue(value > -5);
    }

    // CSV - Comma-Separated Values
    // Источник данных в формате CSV

    @ParameterizedTest
    @CsvSource({"apple, 1", "banana, 2", "cherry, 3"})
    void testWithCSVSource(String fruit, int rank) {
        System.out.println(fruit + " | " + (rank + 10));
        assertTrue(fruit.length() > 4 && rank > 0);
    }

    // Источник данных - файл в формате CSV
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void testFileSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + !flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }

    // Источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSource(String fruit) {
        System.out.println(fruit);
        assertNotNull(fruit);
    }

    static Stream<String> testDataFruits() {
        return Stream.of("apple", "banana", "cherry");
    }

    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSource2(int value) {
        System.out.println("current value: " + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDataInt() {
        return Stream.of(1, 2, -1, 4, 5);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSource3(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);
        int result = value * value;
        // assertEquals(expected, result);
        assertEquals(isEquals, result == expected);
    }

    static Stream<Arguments> testDataArguments() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testPersonsData")
    void testPersonsData(Person person, String newEmail) {
        System.out.println(person);
        System.out.println(newEmail);
    }

    static Stream<Arguments> testPersonsData() {
        Person person = new Person("test@mail.com", "pass1Q!4");
        return Stream.of(
                Arguments.of(person, "new1234@mail.com"),
                Arguments.of(new Person("invalid.mail.com", "password"), "mail.test.com")
        );
    }

}
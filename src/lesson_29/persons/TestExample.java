package lesson_29.persons;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

}
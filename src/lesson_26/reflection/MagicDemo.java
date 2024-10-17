package lesson_26.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MagicDemo {

    public static void main(String[] args) throws Exception {
        Person person = new Person("John") ;

        // Находим приватное поле с именем "name"
        Field nameField = Person.class.getDeclaredField("name");

        // Произношу заклинание и открываю доступ к этому полю
        nameField.setAccessible(true);

        // Меняем значение этого поля у объекта
        nameField.set(person, "Мария");

        // Проверяем, сработало ли заклинание
        System.out.println("Новое имя: " + nameField.get(person));

        // Возвращаем защитные чары на место
        nameField.setAccessible(false);

        // Находим приватный методы "SayHello"
        Method sayHelloMethod = Person.class.getDeclaredMethod("sayHello");

        // Снимаем невидимость
        sayHelloMethod.setAccessible(true);

        // Вызываем метод у объекта person
        sayHelloMethod.invoke(person);

        // Возвращаем приватность методу
        sayHelloMethod.setAccessible(false);

        // Находим приватный методы "SayHello"
        Method testMethod = Person.class.getDeclaredMethod("test", String.class);

        // Снимаем невидимость
        testMethod.setAccessible(true);

        // Вызываем метод с параметрами
        testMethod.invoke(person, "Java");


    }

}

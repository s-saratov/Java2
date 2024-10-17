package lesson_26.reflection.children;

import java.lang.reflect.Method;

public class Children {

    public static void main(String[] args) throws Exception{

        Parent link = new Child();

        // Не могу вызвать метод класса Child из-за "узкого" типа ссылки
        // link.child();

        // Получить реальный класс объекта link
        Class<?> clazz = link.getClass();

        // Получить доступ к методу
        Method method = clazz.getMethod("child", String.class);

        // Вызываем метод child на объекте link
        method.invoke(link, "Пример строки");
    }

}
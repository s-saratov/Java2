package homework_27;

public class PersonApp {

    public static void main(String[] args) {
        Person person = new Person("email", "password");

        // Тесты адреса электронной почты
        System.out.println("Тесты адреса электронной почты:");

        // 1. Пробуем задать адрес с двумя символами @

        person.setEmail("test@test@test.com");
        System.out.println("test@test@test.com:\t" + person.getEmail());

        // 2. Пробуем задать адрес без точки после @

        person.setEmail("test@testcom");
        System.out.println("test@testcom:\t\t" + person.getEmail());

        // 3. Пробуем задать адрес с доменом первого уровня из одного символа

        person.setEmail("test@test.c");
        System.out.println("test@test.c:\t\t" + person.getEmail());

        // 4. Пробуем задать адрес с недопустимым символом $

        person.setEmail("te$t@test.c");
        System.out.println("te$t@test.c:\t\t" + person.getEmail());

        // 5. Пробуем задать адрес без букв до @

        person.setEmail("@test.com");
        System.out.println("@test.com:\t\t\t" + person.getEmail());

        // 6. Пробуем задать адрес, где первый символ - не буква

        person.setEmail("0test@test.com");
        System.out.println("0test@test.com:\t\t" + person.getEmail());

        // 7. Пробуем задать адрес, соответствущий всем требованиям

        person.setEmail("test@test.com");
        System.out.println("test@test.com:\t\t" + person.getEmail());

        // Тесты пароля
        System.out.println("\nТесты пароля:");
        
        // 1. Пробуем задать пароль длиной меньше 8 символов

        person.setPassword("1234567");
        System.out.println("1234567:\t\t" + person.getPassword());

        // 2. Пробуем задать пароль без цифр

        person.setPassword("abcdefgh");
        System.out.println("abcdefgh:\t\t" + person.getPassword());

        // 3. Пробуем задать пароль без строчных букв

        person.setPassword("A1B2C3D4");
        System.out.println("A1B2C3D4:\t\t" + person.getPassword());

        // 4. Пробуем задать пароль без прописных букв и спецсимволов

        person.setPassword("a1b2c3d4");
        System.out.println("a1b2c3d4:\t\t" + person.getPassword());

        // 4. Пробуем задать пароль, соответствущий всем требованиям

        person.setPassword("A1b2c3d!");
        System.out.println("A1b2c3d!:\t\t" + person.getPassword());

        System.out.println("\n" + person.toString());
    }

}
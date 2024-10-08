package homework_19;

/*
Task4
Final параметр метода:
    - Напишите метод printMessage(final String message), который выводит сообщение на экран.
    - попробуйте изменить значение параметра message внутри метода.
    - объясните результат и поведение компилятора.
 */

public class Task4 {

    public String printMessage(final String message) {

//        message = new String "New message"; Cannot assign a value to final variable 'message'
        // При попытке раскомментировать строку выше компилятор выдаст ошибку:
        // "Cannot assign a value to final variable 'message'"

        /*
        Объяснение

        Тип переменной message - String, это ссылочный тип. Когда в метод передаётся переменная ссылочного типа,
        копируется только ссылка, а не сам объект.
        При этом в сигнатуре метода в передаваемом значении указано ключевое слово final.
        Для ссылочных переменных это означает, что после присвоения объекта ссылку на него изменить нельзя.
        Однако именно это мы пытаемся выполнить при помощи команды: message = new String "New message";
         */

        return message;

    }

}
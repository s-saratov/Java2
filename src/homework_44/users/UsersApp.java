package homework_44.users;

/*
Task 4

Напишите метод findUserById(int id), который возвращает Optional<User>. Метод принимает List<User> и int id.
Если пользователь с заданным id существует в списке, вернуть Optional с пользователем, иначе вернуть Optional.empty().

Подсказка: используйте Optional.of(user) или Optional.empty().
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UsersApp {

    public static void main(String[] args) {

        // Создаём список пользователей
        List<User> users = Arrays.asList(
                new User(1, "Alice"),
                new User(2, "Bob"),
                new User(3, "Charlie"),
                new User(4, "Diana"),
                new User(5, "Eve")
        );

        // Выводим список в консоль
        System.out.println("Список пользователей: " + users);

        // Создаём Optional c результатами поиска
        Optional<User> result3 = findUserById2(users, 3);
        Optional<User> result7 = findUserById2(users, 7);

        // Проверяем работу метода
        System.out.print("Пробуем найти пользователя с id 3: ");
        result3.ifPresentOrElse(System.out::println, () -> System.out.println("пользователь не найден"));
        System.out.print("Пробуем найти пользователя с id 7: ");
        result7.ifPresentOrElse(System.out::println, () -> System.out.println("пользователь не найден"));

    }

    public static Optional<User> findUserById(List<User> users, int id) {

        // findFirst() - терминальный метод, возвращающий Optional, в который завёрнут первый элемент потока
        // (если он есть) или пустой Optional
        // Прекращает обработку потока, когда будет найден первый элемент.

        return users.stream()
                .filter(user -> user.getId() == id)     // фильтруем по id
                .findFirst()                            // получаем первого пользователя
                .map(Optional::of)                      // оборачиваем его в Optional
                .orElse(Optional.empty());        // если пользователя нет, возвращаем Optional.empty()

    }

    // Аналогичный метод без использования Stream API
    public static Optional<User> findUserById2(List<User> users, int id) {

        for (User user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();

    }

}
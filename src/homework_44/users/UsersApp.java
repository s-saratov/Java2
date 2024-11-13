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

        // Проверяем работу метода
        System.out.println("Пробуем найти пользователя с id 3: " + findUserById(users, 3));
        System.out.println("Пробуем найти пользователя с id 7: " + findUserById(users, 7));

    }

    public static Optional<User> findUserById(List<User> users, int id) {

        return users.stream()
                .filter(user -> user.getId() == id)     // фильтруем по id
                .findFirst()                            // получаем первого пользователя
                .map(Optional::of)                      // оборачиваем его в Optional
                .orElse(Optional.empty());        // если пользователя нет, возвращаем Optional.empty()

    }

}
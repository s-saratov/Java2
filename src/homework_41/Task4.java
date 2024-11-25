package homework_41;

/*
Task 4
Построение маршрута.

У вас есть карта прямых рейсов, где ключ — это название города отправления, а значение — город назначения.

Необходимо написать функцию, которая принимает карту рейсов, город отправления и город назначения и возвращает
список городов, через которые проходит маршрут. Если прямого рейса нет,
функция должна пытаться найти маршрут с пересадками.

Условия:
    - Если прямого рейса нет, нужно искать возможные пересадки через другие города.
    - Если маршрут невозможно составить, функция должна возвращать пустой список.
    - Предполагается, что нет циклических маршрутов, и из города можно уехать только в один другой город
      (один к одному соответствие).
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {

    public static void main(String[] args) {

        Map<String, String> directFlights = new HashMap<>();
        directFlights.put("New York", "Chicago");
        directFlights.put("Chicago", "Denver");
        directFlights.put("Denver", "Las Vegas");
        directFlights.put("Boston", "Miami");
        directFlights.put("Miami", "New York");
        directFlights.put("Los Angeles", "San Francisco");
        directFlights.put("San Francisco", "New York");

        // Ищем маршрут между Бостоном и Лас-Вегасом
        List<String> route = findRoute(directFlights, "Boston", "Las Vegas");

        // Создаём переменную для маршрута в строковом формате
        String routeStr = new String();

        // Выводим в консоль информацию, что маршрут не найден, если полученный список пустой
        if (route.isEmpty()) System.out.println("Маршрут не найден");
        else {
            for (String city : route) {
                routeStr = routeStr.concat(city);
                if (!city.equals("Las Vegas")) routeStr = routeStr.concat(" → ");
            }
        }

        // Выводим в консоль маршрут в строковом форматен
        System.out.println(routeStr);

    }

    private static List<String> findRoute(Map<String, String> map, String departureCity, String destinationCity) {

        // Создаём коллекцию для хранения маршрута
        List<String> route = new ArrayList<String>();

        // Создаём переменную для хранения текущего города
        String currentCity = departureCity;

        // Возвращаем пустой список, если в карте отсутствует город отправления
        if (!map.containsKey(departureCity)) return route;

        // Добавляем в список город отправления
        route.add(departureCity);

        // В цикле идём от ключа к значению карты и добавляем их в список
        while (map.containsKey(currentCity)) {
            route.add(map.get(currentCity));
            currentCity = map.get(currentCity);
            if (currentCity.equals(departureCity)) break;
        }

        // Очищаем список, если города назначения в нём не оказалось
        if (!route.contains(destinationCity)) route.clear();

        return route;

    }

}
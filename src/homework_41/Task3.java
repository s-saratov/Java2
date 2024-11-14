package homework_41;

/*
Task 3
Пересечение двух карт: Реализуйте метод, который принимает две карты Map<String, Integer> и возвращает новую карту,
содержащую только те записи, ключи которых присутствуют в обеих исходных картах.
Для совпадающих ключей значение можно брать из любой карты.
 */

import java.util.*;

public class Task3 {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<String, Integer> intersectionMap2 = intersection2(map1, map2);
        intersectionMap2.forEach((key, value) -> System.out.println(key + ": " + value));
        
    }

    private static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {

        Map<String, Integer> result = new HashMap<>();      // создаём карту для возврата
        Set<String> keys = new HashSet<>(map1.keySet());    // создаём набор ключей из первой карты

        for (String key : keys) {
            if (map2.containsKey(key)) {                    // добавляем в итоговую карту пары ключ-значения из первой
                result.put(key, map1.get(key));             // карты, если вторая карта содержит соответствующие ключи
            }
        }

        return result;

    }

    private static Map<String, Integer> intersection2(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);
        Set<String> keySet = result.keySet();
        keySet.retainAll(map2.keySet());
        return result;

    }
}
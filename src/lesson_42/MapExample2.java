package lesson_42;

import java.util.*;

public class MapExample2 {

    public static void main(String[] args) {

        Map<Integer, String> mapColors = new HashMap<>();
        mapColors.put(1, "red");
        mapColors.put(16, "green");
        mapColors.put(5, "blue");

        System.out.println(mapColors);

        System.out.println("mapColors.size(): " + mapColors.size());

        System.out.println("mapColors.containsKey(32): " + mapColors.containsKey(32));
        System.out.println("mapColors.containsValue(\"blue\": " + mapColors.containsValue("blue"));

        String color = mapColors.get(16);
        System.out.println("color: " + color);
        System.out.println("mapColors.get(100): " + mapColors.get(100));

        String deleteValue = mapColors.remove(100);
        System.out.println("mapColors.remove(100): " + deleteValue);

        deleteValue = mapColors.remove(5);
        System.out.println("mapColors.remove(5): " + deleteValue);
        System.out.println(mapColors);

        // void clear() - очищает карту
        // mapColors.clear();
        // System.out.println(mapColors);

        // boolean isEmpty() - вернёт true, если карта пустая
        System.out.println(mapColors.isEmpty());

        mapColors.put(7, "yellow");
        mapColors.put(8, "white");
        mapColors.put(24, "white");
        System.out.println(mapColors);

        System.out.println("\n=======================\n");

        // Collection<V> values() - возвращает коллекцию из значений карты
        // Значения в карте могут повторяться. У разных ключей допускаются одинаковые значения
        Collection<String> values = mapColors.values();
        System.out.println("values.size(): " + values.size());
        System.out.println("values: " + values);

        // Set<K> keySet - возвращает set, состоящий из всех ключей карты
        Set<Integer> keysSet = mapColors.keySet();
        System.out.println("keysSet: " + keysSet);
        // Могу перебрать все ключи в цикле - получить значение для каждого ключа
        for (Integer key : keysSet) {
            System.out.println(key + ": " + mapColors.get(key) + "; ");
        }
        System.out.println();

        // Фокус. Между keysSet - map -> "живая" связь. Удаляя ключ из keySet, из map тоже удаляется соответствующая
        // пара "ключ-значение"
        keysSet.remove(7);
        System.out.println(keysSet);
        System.out.println(mapColors);

        // Между values и map - тоже связь
        values.remove("red");
        System.out.println(values);
        System.out.println(mapColors);

        // Todo Entry + replace

        // Map.Entry<K, V> - представляет собой пары ключ-значение

        /*
        K getKey()
        V getValue()
        V set(Value) - заменяет значение, возвращает старое
         */

        // Set<Map.Entry<K, V> entrySet - возвращает set вхождений пар ключ-значение
        // Тоже "живая" связь с картой

        System.out.println(mapColors);

        System.out.println("\n===================\n");

        Set<Map.Entry<Integer, String>> entrySet = mapColors.entrySet();
        System.out.println("entrySet(): " + entrySet);

        System.out.println("\n===================\n");

        for (Map.Entry<Integer, String> entry : mapColors.entrySet()) {
            System.out.print("entry.getKey(): " + entry.getKey());
            System.out.print(" -> ");
            System.out.println("entry.getValue(): " + entry.getValue());
            if (entry.getKey().equals(8)) {
                entry.setValue("JAVA!");
            }

        }

        System.out.println("\n===================\n");

        System.out.println(mapColors);

        mapColors.put(10, "red"); // put - если ключа нет, создаётся новая пара "ключ-значение"
        mapColors.put(10, "yellow"); // put - если ключ уже есть, значение для этого ключа будет заменено (перезаписано)
        // - вернёт старое значение

        // replace vs. put
        mapColors.replace(11, "blue"); // replace - если ключа нет, новая пара "ключ-значение" НЕ создаётся
        mapColors.replace(10, "purple"); // replace - если ключа уже есть, значение для этого ключа будет заменено (перезаписано)
        // - вернёт старое значение

        System.out.println(mapColors);

        // Перебор всех пар "ключ-значение" в "функциональном стиле". Есть возможность применять к ним какую-то функцию
        mapColors.forEach((key, val) -> System.out.println("key: " + key + ", value: " + val));

        System.out.println("\n===================\n");

        mapColors.forEach((k, v) -> {
            System.out.println("Iteration:");
            System.out.println("key :" + k + ", value: " + v);
            System.out.println("=================\n");
        });

    }

}

//        List<Integer> integers = new ArrayList<>(List.of(1, 5, 6, 6, 7, 7, 8));
//
//        for (Integer key : integers) {
//            Integer element = integers.get(i);
//        }
//
//        for (Integer element : integers) {
//
//        }
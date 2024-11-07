package lesson_41;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        // Конструкторы
        Map<String, Integer> test = new HashMap<>(); // создаёт пустой список на 16 корзин. Коэффициент загрузки 0,75
        // (12 элементов)

        test = new HashMap<>(32); // cоздаёт пустой список на 32 корзины.
        // Коэффициент загрузки 0.75 (24 элементов)

        test = new HashMap<>(32, 0.90f); // Создаёт пустой список на 32 корзины.
        // Коэффициент загрузки 0,90 (29 элементов)

        Map<String, Integer> otherMap = new HashMap<>();
        otherMap.put("a", 1);
        otherMap.put("b", 2);

        test = new HashMap<>(otherMap); // создаётся новая карта. Конструктор принимает другую карту,
        // копирует из неё все пары "ключ-значение"
        System.out.println(test);

        System.out.println("\n====================\n");

        List<String> strings = new ArrayList<>();
        System.out.println(strings.add("Hello"));
        strings.add("World");
        System.out.println(strings);

        Map<Integer, String> oldTable = new HashMap<>(); // устаревшая, медленная. Не рекомендуется использовать

        // Конструктор создаёт пустую карту ("мапу") ёмкостью в 16 корзин
        Map<Integer, String> map = new HashMap<>();

        // V put(K key, V value) - добавление пары ключ-значение
        // Возвращает старое значение, соответствующее ключу ранее. Если ключа не было, вернёт null
        String oldValue = map.put(1, "Hello");
        System.out.println(oldValue);
        map.put(2, "World");
        map.put(3, "Java");

        // Вернёт null, т.к. в карте нет такого ключа = нет пары с ключом 4
        System.out.println("map.put(4, Python): " + map.put(4, "Python"));
        System.out.println("map: " + map);

        // Ключ 4 уже есть в карте. Значит при попытке поместить в карту пару ключ (4) + значение
        // вернётся значение, которое было ранее присвоено ключу (4)

        oldValue = map.put(4, "Orange");
        System.out.println("map.put(4, Orange): " + oldValue);

        System.out.println("map.put(4, \"Apple\"): " + map.put(4, "Apple"));

        System.out.println("map: " + map);

        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(0, "Python");
        newMap.put(2, "New Value");
        System.out.println("newMap: " + newMap);

        // putAll - принимает карту и копирует все пары "ключ-значение" из этой карты
        map.putAll(newMap);
        System.out.println("map: " + map);

        // boolean containsKey(Object key) - вернёт true, если карта содержит указанный ключ
        // boolean containsValue(Object value) - вернёт true, если карта содержит указанное значение (одно или несколько)

        System.out.println("map.containsKey(8): " + map.containsKey(8)); // такого ключа нет - false
        System.out.println("map.containsKey(1): " + map.containsKey(1)); // такой ключ есть - true
        System.out.println("map.containsValue(\"Java\"): " + map.containsValue("Apple")); // такое значение есть - true
        System.out.println("map.containsValue(\"Orange\"): " + map.containsValue("Orange")); // такого значения нет - false
        System.out.println("map.containsValue(\"NoValue\"): " + map.containsValue("NoValue")); // такого значения нет - false

        System.out.println("\n======== Получение значения по ключу ========\n");
        System.out.println(map);

        // get(Object key) - возвращает значение по ключу. Если ключа нет, вернёт null
        String value = map.get(3);
        System.out.println("map.get(3): " + value);
        System.out.println("map.get(100): " + map.get(100)); // ключа нет - вернёт null

        // V getOrDefault(Object key, V defaultValue) - возвращает значение по ключу. Если ключа нет, вернёт defaultValue
        value = map.getOrDefault(3, "Default"); // ключ есть - вернёт значение
        System.out.println("map.getOrDefault(3, \"Default\"): " + value);

        value = map.getOrDefault(100, "Default"); // ключа нет, вернёт "Default"
        System.out.println("map.getOrDefault(100, \"Default\")" + value);

        System.out.println("\n======== Удаление пары \"ключ-значение\" по ключу ========\n");
        System.out.println(map);

        // V remove (Object key) - удаляет пару "ключ-значение", возвращает значение или null
        System.out.println("map.remove(100): " + map.remove(100)); // ключа нет, ничего не удалит, вернёт null
        System.out.println("map.remove(4): " + map.remove(4)); // ключ есть, удалить пару "ключ-значение",
        // вернёт значение, которе было у ключа

        map.put(-1000, "Minus");
        // В качестве ключа допустимо использовать null
        map.put(null, "NullValue");
        System.out.println(map);
    }

}
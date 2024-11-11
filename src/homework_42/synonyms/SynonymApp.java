package homework_42.synonyms;

import java.util.List;

public class SynonymApp {

    public static void main(String[] args) {

        SynonymDictionary dictionary = new SynonymDictionary();

        // Добавляем три синонима слова "быстрый"

        dictionary.addSynonym("быстрый","стремительный");
        dictionary.addSynonym("быстрый","проворный");
        dictionary.addSynonym("быстрый","летучий");

        // Выводим список синонимов слова "быстрый"

        System.out.println("Список синонимов слова \"быстрый\": " + dictionary.getSynonyms("быстрый"));

        // Добавляем синоним слова "маленький"

        dictionary.addSynonym("маленький","небольшой");

        // Создаём список синонимов слова "маленький"
        List<String> synonymsForSmall = List.of("небольшой", "мелкий", "крошечный", "миниатюрный");

        // Обновляем список синонимов для слова "маленький"

        dictionary.updateSynonyms("маленький", synonymsForSmall);

        // Выводим в консоль весь словарь синонимов

        System.out.println(dictionary);

        // Удаляем синоним "мелкий"

        dictionary.removeSynonym("маленький", "мелкий");

        // Удаляем слово "быстрый" и все его синонимы

        dictionary.removeWord("быстрый");

        // Выводим в консоль весь словарь синонимов

        System.out.println(dictionary);

    }

}
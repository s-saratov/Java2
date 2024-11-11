package homework_42.synonyms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SynonymDictionary {

    // Поле

    private HashMap<String, List> dictionary; // словарь синонимов

    // Конструктор

    public SynonymDictionary() {
        this.dictionary = new HashMap<>();
    }

    // Методы

    // Добавляет синоним к слову
    public boolean addSynonym(String word, String synonym) {

        // Исключаем передачу некорректных данных
        if (word == null || synonym == null) return false;

        dictionary.computeIfAbsent(word, k -> new ArrayList<>()).add(synonym);
        return true;
    }

    // Возвращает список синонимов для заданного слова
    public List<String> getSynonyms(String word) {
        return dictionary.getOrDefault(word, new ArrayList<>());
    }

    // Обновляет список синонимов для слова
    public boolean updateSynonyms(String word, List synonyms) {

        // Исключаем передачу некорректных данных
        if (word == null || synonyms == null) return false;

        dictionary.put(word, new ArrayList<>(synonyms));
        return true;
    }

    // Удаляет синоним из списка синонимов слова
    public boolean removeSynonym(String word, String synonym) {

        // Исключаем передачу некорректных данных
        if (word == null || synonym == null) return false;

        List<String> synonyms = dictionary.get(word);
        if (synonyms != null) {
            synonyms.remove(synonym);
            if (synonyms.isEmpty()) {
                dictionary.remove(word);
            }
        }
        return true;
    }

    // Удаляет слово и все его синонимы из словаря
    public boolean removeWord(String word) {

        // Исключаем передачу некорректных данных
        if (word == null ) return false;

        dictionary.remove(word);
        return true;
    }

    @Override
    public String toString() {
        return "SynonymDictionary{" +
                "dictionary=" + dictionary +
                '}';
    }
}
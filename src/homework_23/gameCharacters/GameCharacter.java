package homework_23.gameCharacters;

/*

Task 2

Создайте абстрактный класс GameCharacter, который представляет базовый класс для игровых персонажей.
Определите абстрактный метод attack(), который будет различаться для разных типов персонажей
(например, воин атакует мечом, а маг использует магические заклинания).
Создайте несколько конкретных подклассов, представляющих разные типы персонажей, такие как Warrior, Mage, Archer и т.д.
Переопределите метод attack() для каждого класса.
Создайте массив из игровых персонажей разных типов. Вызовите у каждого метод attack() в цикле.
 */

abstract class GameCharacter {

    // Поле - класс персонажа

    String characterClass;

    // Геттеры и сеттеры

    public String getCharacterClass() {
        return characterClass;
    }
    protected void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    // Абстрактный метод атаки

    abstract void attack();

}
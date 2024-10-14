package homework_23.gameCharacters;

public class Mage extends GameCharacter {

    // Конструктор

    public Mage() {
        setCharacterClass("Маг");
    }

    // Метод атаки (перегруженный)

    @Override
    void attack() {
        System.out.println("Читаю заклинание - делаю магические пассы - заклинание действует!");
    }
}
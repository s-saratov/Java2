package homework_23.gameCharacters;

public class Warrior extends GameCharacter {

    // Конструктор

    public Warrior() {
        setCharacterClass("Воин");
    }

    // Метод атаки (перегруженный)

    @Override
    void attack() {
        System.out.println("Взмах мечом - удар!");
    }
}

package homework_23.gameCharacters;

public class Thief extends GameCharacter {

    // Конструктор

    public Thief() {
        setCharacterClass("Вор");
    }

    // Метод атаки (перегруженный)

    @Override
    void attack() {
        System.out.println("Подкрадываюсь сзади - выхватываю кинжал - удар!");
    }
}
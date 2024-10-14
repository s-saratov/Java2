package homework_23.gameCharacters;

public class Archer extends GameCharacter {

    // Конструктор

    public Archer() {
        setCharacterClass("Лучник");
    }

    // Метод атаки (перегруженный)

    @Override
    void attack() {
        System.out.println("Заряжаю стрелу - целюсь и натягиваю тетиву - выстрел!");
    }
}
package homework_23.gameCharacters;

public class GameMain {

    public static void main(String[] args) {

        // Создаём четырёх персонажей разных классов

        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        Archer archer = new Archer();
        Thief thief = new Thief();

        // Создаём массив экземпляров класса gameCharacters, который заполняем преобразованными персонажами

        GameCharacter[] gameCharacters = new GameCharacter[4];
        gameCharacters[0] = warrior;
        gameCharacters[1] = mage;
        gameCharacters[2] = archer;
        gameCharacters[3] = thief;

        // Запускаем метод атаки всех персонажей

        for (int i = 0; i < gameCharacters.length; i++) {
            System.out.printf(gameCharacters[i].getCharacterClass() + ": ");
            gameCharacters[i].attack();
        }

    }

}
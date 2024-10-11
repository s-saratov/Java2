package homework_22.sportsmen;

public class SportsmenMain {

    public static void main(String[] args) {

        // Создаём трёх бегунов

        Human human = new Human();
        Amateur amateur = new Amateur();
        Professional professional = new Professional();

        // Запускаем метод бега, выводящий количество минут, необходимых для отдыха

        human.run();
        amateur.run();
        professional.run();
    }

}
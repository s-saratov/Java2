package homework_22.sportsmen;

public class Professional extends Amateur {

    // Конструктор, меняющий значения полей материнского класса

    public Professional() {
        setSpeed(25);
        setRestTime(5);
    }

    // Переопределённый метод бега

    @Override
    public void run() {
        System.out.printf("Для отдыха спортсмену-профессионалу нужно %d минут.\n", getRestTime());
    }

}
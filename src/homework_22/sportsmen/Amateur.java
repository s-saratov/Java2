package homework_22.sportsmen;

public class Amateur extends Human {

    // Конструктор, меняющий значения полей материнского класса

    public Amateur() {
        setSpeed(15);
        setRestTime(10);
    }

    // Переопределённый метод бега

    @Override
    public void run() {
        System.out.printf("Для отдыха спортсмену-любителю нужно %d минут.\n", getRestTime());
    }

}

package homework_22.sportsmen;

/*
Task 1

Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи
У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */

public class Human {

    // Поля

    private int speed = 10;     // скорость
    private int restTime = 15;  // время отыха

    // Геттеры и сеттеры

    public int getSpeed() {
        return speed;
    }
    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRestTime() {
        return restTime;
    }
    protected void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    // Метод бега

    public void run() {
        System.out.printf("Для отдыха обычному человеку нужно %d минут.\n", getRestTime());
    }

}
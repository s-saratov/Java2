package homework_18;

/*
Task 2

Написать класс Собака (Dog):
    - каждая Собака обязательно должна иметь имя и высоту прыжка;
    - должна уметь прыгать и должна уметь тренироваться;
    - за каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров;
    - максимальная высота прыжка, которую может натренировать собака, не может быть больше,
    чем двукратная высота первоначального прыжка.

Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера.
Если собака в состоянии преодолеть этот барьер - прыгает. Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер). Если да -> идем тренироваться -> берет барьер
 */

public class Dog {

    // Поля

    private String name;
    private double jumpHeight;
    private double maxJumpHeight;

    // Конструктор

    public Dog(String name, float jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    // Геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public double getMaxJumpHeightJumpHeight() {
        return maxJumpHeight;
    }

    // Методы

    // 1. Прыгать через барьер

    public void jumpBarrier(float barrier) {
        if (barrier > maxJumpHeight) {
            System.out.printf("К сожалению, попытка бессмысленна. Собака %s не сможет преодолеть барьер высотой " +
                    "%.1f сантиметров даже в своей лучшей физической форме.\n", name, barrier);
            return;
        }
        else if (jumpHeight < barrier) {
            System.out.printf("В настоящее время собака %s не сможет преодолеть барьер высотой " +
                    "%.1f сантиметров. Необходима тренировка!\n", name, barrier);
            do { train(); } while (jumpHeight < barrier);
        }
        System.out.printf("Але - гоп! Собака %s успешно взяла высоту %.1f сантиметров.\n", name, barrier);
    }

    // 2. Тренироваться

    public void train() {

        if (jumpHeight + 10.0 > maxJumpHeight) jumpHeight = maxJumpHeight;
        else jumpHeight += 10.0;
        System.out.printf("Тренировка завершена. Теперь высота прыжка собаки %s составляет %.1f сантиметров.\n",
                name, jumpHeight);
    }

}
package homework_19;

import java.util.Arrays;
import java.util.Random;

public class DogMain {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("1. Создаём пять объектов класса со случайным прыжком от 30 до 80:");

        Dog[] dogs = new Dog[5];

        for (int i = 0; i < 5; i++) {
            dogs[i] = new Dog("Dog № " + (i + 1), random.nextDouble() * 50 + 30);
        }

        for (int i = 0; i < 5; i++) System.out.println(dogs[i].toString());

        System.out.println("\n2. Создаём массив из семи высот барьеров со случайными значениями от 70 до 170:");

        int[] barriers = new int[7];

        for (int i = 0; i < barriers.length; i++) {
            barriers[i] = random.nextInt(101) + 70;
            System.out.printf("Барьер № %d высотой %d см.\n", i + 1, barriers[i]);
        }

        System.out.println("\n3. Начинаем соревнования! Каждая из собак пробует преодолеть каждый из барьеров.");

        int[] results = new int[dogs.length]; // создаём массив с результатами преодоления барьеров

        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                dogs[i].jumpBarrier(barriers[j]);
                if(dogs[i].getJumpHeight() >= barriers[j]) results[i]++;
            }
        }
        System.out.println("\n4. Объявляем результаты соревнований:");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("Собака %s - преодолено барьеров: %d\n", dogs[i].getName(), results[i]);
        }

    }

}
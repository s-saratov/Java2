package homework_38.spotsmen;

import lesson_38.Car;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmenApp {

    public static void main(String[] args) {

        Sportsman[] sportsmen = new Sportsman[5];

        sportsmen[0] = new Sportsman("Charlie", 23, 178);
        sportsmen[1] = new Sportsman("Eve", 27, 166);
        sportsmen[2] = new Sportsman("Bob", 30, 163);
        sportsmen[3] = new Sportsman("David", 40, 158);
        sportsmen[4] = new Sportsman("Alice", 20, 142);

        System.out.println("1. Изначальное состояние массива спортсменов:\n");
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("\n2. Состояние массива спортсменов после сортировки по имени методом класса compareTo:\n");
        Arrays.sort(sportsmen);
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("\n3. Состояние массива спортсменов после сортировки по рейтингу компаратором sportsmanScoreComparator:\n");
        SportsmanScoreComparator sportsmanScoreComparator = new SportsmanScoreComparator();
        Arrays.sort(sportsmen, sportsmanScoreComparator);
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("\n4. Состояние массива спортсменов после сортировки по возрасту анонимным классом Comparator :\n");

        Arrays.sort(sportsmen, new Comparator<Sportsman>() {

            @Override
            public int compare(Sportsman sportsman1, Sportsman sportsman2) {
                return sportsman1.getAge() - sportsman2.getAge();
            }
        });

        System.out.println(Arrays.toString(sportsmen));

    }

}
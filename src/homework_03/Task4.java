package homework_03;

/*
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).

Вычислите среднюю температуру за неделю и выведете ее на печать.
 */

public class Task4 {

    public static void main(String[] args) {

        double temp05Sept = 28.8;
        double temp06Sept = 23.3;
        double temp07Sept = 27.2;
        double temp08Sept = 21.5;
        double temp09Sept = 15.0;
        double temp10Sept = 16.4;
        double temp11Sept = 13.1;

        System.out.println("Höchsttemperaturen in der Gemeinde Weissach im Tal in den vergangenen sieben Tagen:");
        System.out.println("05. September - " + temp05Sept + " Grad");
        System.out.println("06. September - " + temp06Sept + " Grad");
        System.out.println("07. September - " + temp07Sept + " Grad");
        System.out.println("08. September - " + temp08Sept + " Grad");
        System.out.println("09. September - " + temp09Sept + " Grad");
        System.out.println("10. September - " + temp10Sept + " Grad");
        System.out.println("11. September - " + temp11Sept + " Grad\n");
        System.out.println("Die durchschnittliche Temperatur in sieben Tagen beträgt " + (temp05Sept + temp06Sept + temp07Sept + temp08Sept + temp09Sept + temp10Sept + temp11Sept) / 7 + " Grad");

    }

}
